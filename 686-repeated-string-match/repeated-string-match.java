class Solution {
    public int repeatedStringMatch(String a, String b) {


        if(a.contains(b)) return 1;
        //if b has to be in a , then a should be appended minimum of b.length() times 
        // if a len = 4 , b len =8 then a should repeat 2 times (8/4)
        // if a len = 3 , b len =8 then we need a to repeat 3 times (8/3)
        //so we use ceil 
        int minRepeats = (int)Math.ceil((double)(b.length())/a.length()) ;
        String c = "";

            // minRepeats → makes a at least as long as b.
        // +1 → covers the case where b overlaps across repeat boundaries.
        // +2 → edge-case safety net (guarantees we don’t miss cases).
        // \U0001f449 In short:
        // We do i <= minRepeats + 2 to cover all possible alignments of b inside repeated a, without missing     corner cases.
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