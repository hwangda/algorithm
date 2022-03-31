    public class ChessMetric {
        static long [][][] ways= new long[100][100][55];

        static int[] dx = {0,1,1,1,0,-1,-1,-1, 1,2,2,1,-1,-2,-2,-1};
        static int[] dy = {-1,-1,0,1,1,1,0,-1, -2,-1,1,2,2,1,-1,-2};

        public static long howMany(int size, int[] start, int[] end, int numMoves){
            int sx = start[0], sy = start[1], ex = end[0], ey = end[1];

            ways[sx][sy][0] = 1;
            for(int i=1;i<=numMoves;i++){
                for(int x=0;x<size;x++){
                    for(int y = 0;y<size;y++){
                        for(int j=0;j<16;j++){
                            int nx = x + dx[j];
                            int ny = y + dy[j];
                            if(nx < 0|| ny < 0 || nx >=size || ny >= size){
                                continue;
                            }

                            ways[nx][ny][i] += ways[x][y][i-1];
                        }
                    }
                }
            }
            return ways[ex][ey][numMoves];    
        }

        public static void main(String[] args) {
            long ans = howMany(3, new int[]{0,0}, new int[]{1,2}, 1);

            System.out.println(ans);
        }
    }
