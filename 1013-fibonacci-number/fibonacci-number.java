// Approach 1: Recursion 
// class Solution {
//     public int fib(int n) {
//         if(n<=1)
//         {
//             return n;
//         }
//         else{
//             return fib(n-1)+fib(n-2);
//         }
        
//     }
// }


//HERE for fib(5) = fib4 + fib3 , again fib4=fib3 + fib2 , i.e fib(3) will be calculated multiple times . instead of calculating multiple times , we calculate it once and store it in array. so dp is preferred

// method1 : Memoization
//method2: Tabulation 


//memoization 
class Solution {
    // Arrays.fill(dp,-1);
    public int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
       return solve(n,dp);
    }

    public static int solve(int n,int[] dp){
     if(n==1) return 1;
     if(n==0) return 0;
     //if computed , return
     if(dp[n]!=-1){
        return dp[n];
     }




     // if not computted , compute

        dp[n]=solve(n-1,dp) + solve(n-2,dp);

        

        return dp[n];


    }

}