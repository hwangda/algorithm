public class FriendScore {
    public static int highestScore(String[] friends){
        int max = 0;

        for(int i=0;i<friends.length;i++){
            int tmpMax = 0;
            for(int j=0;j<friends[0].length();j++){
                if(friends[i].charAt(j) == 'Y'){
                    if(friends.length <=3){ //3 명 이하인 경우는 건널 필요가 없음
                        tmpMax += 1;
                        continue;
                    }
                    for(int k=0;k<friends.length;k++){ // 한 다리 건넌 친구들의 친구들 수
                        if(friends[k].charAt(j) == 'Y'){
                            tmpMax += 1;
                            // System.out.println("i : " + i + ",j : "+ j + ", k: " + k);
                        }
                    }
                }
            }
            max = Math.max(max, tmpMax);
        }
        return max;
    }
    public static void main(String[] args) {
        String[] friends = { "NYY", "YNY", "YYN"};
        System.out.println(highestScore(friends));

        String[] friends2 = { "NYNNN", "YNYNN", "NYNYN", "NNYNY", "NNNYN"};
        System.out.println(highestScore(friends2));
    }
}
