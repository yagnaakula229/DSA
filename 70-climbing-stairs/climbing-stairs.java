class Solution {
    public int climbStairs(int n) {

        //first step 1 way
        if(n==1){
            return 1;
        }

        // second step 2 ways
        if(n==2){
            return 2;
        }
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }

    public static int solve(int n , int[] dp){

        //dp[0] means total ways to reach first step
        dp[0]=1;
        //dp[1] means  total ways to reach second step
        dp[1]=2;
        //dp[2] means total  ways to reach third step 
        //dp[3] means total  ways to reach fouth step
        // likewise dp[n-1] means ways to reach nth step;


        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];

        }
        
        return dp[n-1];
    }
}