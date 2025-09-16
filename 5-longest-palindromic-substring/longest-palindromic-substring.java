class Solution {
    public static String expandFromCenter(String s,int p1,int p2){
        int maxLen=0;
        String ans="";
        while(p1>=0 && p2<s.length() && s.charAt(p1)==s.charAt(p2)){
            if(p2-p1+1>maxLen){
                ans=s.substring(p1,p2+1);
                maxLen=p2-p1+1;
            }
            p1--;
            p2++;//expanding outwards

        }
         return ans;

    }
    public String longestPalindrome(String s) {
        String maxString=s.substring(0,1);
        String ans=maxString;
        for(int i=0;i<s.length()-1;i++){
            //if s is of odd length

           
            String odd = expandFromCenter(s,i,i);
            if(odd.length()>maxString.length()){
                maxString = odd;
                ans=odd;
            }
            // if s is even length;
           
            String even =expandFromCenter(s,i,i+1);
            if(even.length()>maxString.length()){
                maxString = even;
                ans=even;
            }
        }

        return ans;
    }
}