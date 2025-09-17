class Solution {
    public int repeatedStringMatch(String a, String b) {


        if(a.contains(b)) return 1;
        //if b has to be in a , then a should be appended minimum of b.length() times 
        int minRepeats = (int)Math.ceil((double)(b.length())/a.length()) ;
        String c = "";
        for(int i=1;i<=minRepeats+2;i++){
            c=c+a;
            if(c.contains(b)){
                return i;
            }
        }
        return -1;



        // Time Limit Exceeded
        // 57 / 61 testcases passed    
        
        // if(a.contains(b)){
        //     return 1;
        // }
        
        // String c = a;
        // for(int i=1;i<=b.length();i++){
        //     c = c+a;
        //     if(c.contains(b)){
        //         return i+1;
        //     }
        // }
        // return -1;
    }
}