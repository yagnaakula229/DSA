class Solution {
    public int climbStairs(int n) {
        if(n==1){
            return n;
        }
        if(n==2){
            return 2;
        }
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }

    public static int solve(int n , int[] dp){

        if(n<=1){
            return n;
        }
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];

        }

        return dp[n-1];
    }
}