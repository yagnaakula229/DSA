class Solution {

    //RECURSION

    // public static int solve(int ind,int[] nums){
    //     if(ind==0) return nums[ind];
    //     if(ind<0) return 0;
    //     int pick = nums[ind] + solve(ind-2,nums);
    //     int notPick = 0 + solve(ind-1,nums);

    //     return Math.max(pick,notPick);
    // }

    //MEMOIZATION

    // public static int solve(int ind,int[] nums,int[] dp){
    //     if(ind==0) return nums[ind];
    //     if(ind<0) return 0;
        
    //     int pick = nums[ind] + solve(ind-2,nums,dp);
    //     int notPick = 0 + solve(ind-1,nums,dp);

    //     dp[ind] = Math.max(pick,notPick);
    //     return dp[ind];
    // }



    //Tabulation

    
    // public static int solve(int ind,int[] nums,int[] dp){
    //     // if(ind==0) return nums[ind];
    //     dp[0] = nums[0];
    //     if(ind>=1)
    //     dp[1]=Math.max(nums[0],nums[1]);
    //     if(ind<0) return 0;
    //     int neg=0;
    //     int pick=0;
    //     int notPick=0;
    //     for(int i=2;i<nums.length;i++){
    //         // int pick = nums[ind] + solve(ind-2,nums,dp);
    //         if(ind>1)
    //         pick = nums[i] + dp[i-2];
    //        else
    //        pick=nums[i];
    //         if(ind>0)
    //         notPick = 0 + dp[i-1];
            
    //          dp[i] = Math.max(pick,notPick);
    //     }
    //     return dp[ind];
        
    // }


    //Space Optimization
     public static int solve(int ind,int[] nums,int[] dp){
        // if(ind==0) return nums[ind];
        dp[0] = nums[0];
        if(ind>=1)
        dp[1]=Math.max(nums[0],nums[1]);
        if(ind<0) return 0;
        int neg=0;
        int pick=0;
        int notPick=0;
        int curr=0;
        int prev1=nums[0],prev2=0;
      
        for(int i=1;i<nums.length;i++){
            // int pick = nums[ind] + solve(ind-2,nums,dp);
            if(ind>1)
            pick = nums[i] + prev2;
           else
           pick=nums[i];
            if(ind>0)
            notPick = 0 + prev1;
            
             curr = Math.max(pick,notPick);
             prev2=prev1;
             prev1=curr;
        }
        return prev1;
        
    }



    public int rob(int[] nums) {
        int n=nums.length;
      //Recursion
        // return solve(n-1,nums);

        //REcursion gives TLE;

        //overlapping subproblems exists -  so dp


        //MEmoization

        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);

        return solve(n-1,nums,dp);

    }
}