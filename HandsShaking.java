public class HandsShaking {
    //카탈랑 수 서치
    long[] dp = new long[52];
    // long MOD = 987654321;
    public long countPerfect(int n){
        dp[0] = dp[2] = 1;

        for(int i=4;i<=n;i+=2){
            for(int j=0; j<= i-2;j++){
                dp[i] += dp[j] * dp[i-j-2];
                // dp[i] %= MOD;
            }
        }

        return dp[n];
    }

    public static void main(String[] args){
        HandsShaking hands = new HandsShaking();

        long answer = hands.countPerfect(8);
        System.out.println(answer);
    }
}
