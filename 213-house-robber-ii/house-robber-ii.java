class Solution {


// Recursion 
    // public static int solve(int n ,List<Integer> ar){
    //     if(n==0) return ar.get(n);
    //     if(n<1) return 0;
    //     int pick = ar.get(n) + solve(n-2, ar);
    //     int notPick = 0 + solve(n-1,ar);


    //     return Math.max(pick,notPick);
    // }


    // Memoization 
    // public static int solve(int n ,List<Integer> ar,int[] dp){
    //     if(n==0) return ar.get(n);
    //     if(n<1) return 0;
    //     int pick = ar.get(n) + solve(n-2, ar,dp);
    //     int notPick = 0 + solve(n-1,ar,dp);


    //     dp[n] = Math.max(pick,notPick);
    //     return dp[n];
    // }

    // Tabulation 

    // public static int solve(int n ,List<Integer> ar,int[] dp){
    //     dp[0] = ar.get(0);
     
    //     // dp[1] = Math.max(ar.get(0), ar.get(1));
    //     int pick = 0, notPick=0;
    //     for(int i=1;i<ar.size();i++){
    //         if(i-2 >= 0)
    //          pick = ar.get(i) + dp[i-2];
    //         else
    //         pick = ar.get(i);
    //         if(i-1>=0)
    //         notPick = 0 + dp[i-1];

    //     dp[i] = Math.max(pick,notPick);
    //     }
    //     return dp[n];
    // }

//Space Optimization 

public static int solve(int n ,List<Integer> ar,int[] dp){
       
     
        // dp[1] = Math.max(ar.get(0), ar.get(1));
        int pick = 0, notPick=0;
        int curr=0,prev1=0,prev2=0;

        prev1=ar.get(0);

        for(int i=1;i<ar.size();i++){
            if(i-2 >= 0)
             pick = ar.get(i) + prev2;
            else
            pick = ar.get(i);
            if(i-1>=0)
            notPick = 0 + prev1;

        curr = Math.max(pick,notPick);
        prev2=prev1;
        prev1=curr;
        }
        return prev1;
    }




    public int rob(int[] nums) {
    //     [2,3,2]
    //    step1 : inlude first ele and exclude last ele 
    //step2 : exclude first ele and include last ele 




        List<Integer> ar1 = new ArrayList<>();
        List<Integer> ar2 = new ArrayList<>();
        int n=nums.length;
    if(n==1) return nums[0];

    int dp[] =  new int[n+1];
        for(int i=0;i<nums.length;i++){
            if(i!=n-1) ar1.add(nums[i]);
            if(i!=0) ar2.add(nums[i]);
        }
//  recursion 
        // return Math.max(solve(ar1.size()-1,ar1),solve(ar2.size()-1,ar2));

        //Memoization
        return Math.max(solve(ar1.size()-1,ar1,dp),solve(ar2.size()-1,ar2,dp));

    }
}