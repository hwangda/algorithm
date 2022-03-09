public class CrazyBot {
    boolean[][] checked = new boolean[100][100];

    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    // e, w, s, n

    double[] prob = new double[4];

    public double getProbability(int n, int east, int west, int south, int north){
        prob[0] = east / 100.0;
        prob[1] = west / 100.0;
        prob[2] = south / 100.0;
        prob[3] = north / 100.0;

        return dfs(50, 50, n);
    }
    public double dfs(int x, int y, int n){
        if(checked[x][y]) return 0;

        if(n == 0) return 1;

        checked[x][y] = true;
        double ret = 0.0;
        for(int i = 0; i<4; i++){
            ret += dfs(x + dx[i], y + dy[i], n-1) * prob[i];
        }
        checked[x][y] = false;

        return ret;
    }

    public static void main(String[] args) {
        CrazyBot crazyBot = new CrazyBot();

        double ans = crazyBot.getProbability(2, 25, 25, 25, 25);
        System.out.println(ans);

        ans = crazyBot.getProbability(14, 25, 25, 25, 25);
        System.out.println(ans);
    }
}
