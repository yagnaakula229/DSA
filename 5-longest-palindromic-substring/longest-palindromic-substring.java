class Solution {

    public String expandFromCenter(String s , int p1, int p2){
        int n=s.length();
        while(p1>=0 && p2<n && s.charAt(p1)== s.charAt(p2)){
            p1--;
            p2++;// for palindromes we need to expand outwards

        }

        // \U0001f511 Why not substring(p1, p2+1)?
        //     Because when the loop stops, p1 and p2 are already outside the valid palindrome range.
        //     We need p1+1 (left boundary inside) and p2 (right boundary exclusive in Java).
        return s.substring(p1+1,p2);
    }
    // public static boolean isPalindrome(String s){
    //     int n= s.length();
        
    //     int p1=0,p2=n-1;
    //     while(p1<p2){
    //         if(s.charAt(p1)!=s.charAt(p2)){
    //             return false;
    //         }

    //     }
    //     return true;

    // }
    public String longestPalindrome(String s) {

        // tle 
        // int n=s.length();
        // if(n<=1)
        // return s;
        // int p1=0,p2=n-1;
        // int len=0;
        // String maxStr="";
        // int maxLen=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(isPalindrome(s.substring(i,j))){
        //             maxLen=j-i;
        //             maxStr=s.substring(i,j);
        //         }
        //     }
        // }
        // return maxStr;

int n =s.length();
if(n<=1)
return s;
String maxStr =s.substring(0,1);
for(int i=0;i<s.length()-1;i++){

     // checking lps by assuming substring as odd length ;
    // handling odd cases , keeping p1 and p2 at same positions 
    String odd = expandFromCenter(s,i,i);

     //cheking lps by assuming substring as even length;
    // handling even cases , keeping p1 and p2 at different positions 

    String even = expandFromCenter(s,i,i+1);
    if(odd.length()>maxStr.length()){
        maxStr = odd;

    }
    if(even.length() > maxStr.length()){
        maxStr=even;
    }

}
return maxStr;






    }
}