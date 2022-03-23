public class BadNeightbors {
    public static int maxDonations(int[] donations){
        int ans = 0;
        int[] dp = new int[donations.length];
        int[] dp2 = new int[donations.length];
        for(int i=0;i<donations.length-1;i++){
            dp[i] = donations[i];
            if(i > 0) dp[i] = Math.max(dp[i], dp[i-1]);
            if(i > 1) dp[i] = Math.max(dp[i], dp[i-2] + donations[i]); 
            ans = Math.max(ans, dp[i]);

            dp2[i] = donations[i+1];
            if(i>0) dp2[i] = Math.max(dp2[i], dp2[i-1]);
            if(i>1) dp2[i] = Math.max(dp2[i], dp2[i-2] + donations[i]);
            ans = Math.max(ans, dp2[i]);
        }
        return ans;
    }

    public static void main(String[] args){
        int[] donations = {7,7,7,7,7,7};
        int max = maxDonations(donations);

        System.out.print(max);
    }
}
