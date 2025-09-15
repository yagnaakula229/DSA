class Solution {
    public boolean rotateString(String s, String goal) {



        // OPTIMISED  
        if(s.length()!=goal.length()){
            return false;
        }

        return (s+s).contains(goal);




        //  ***   BRUTE FORCE ***  //

        //  if(s.length()!=goal.length()){
        //     return false;
        // }

        // for(int i=0;i<s.length();i++){
        //     for(int j=0;j<goal.length();j++){
        //         if(s.contains(goal.substring(0,j))){
        //             if(s.contains(goal.substring(j,goal.length()))){
        //                 return true;
        //             }
        //         }
        //     }
        // }

        // return false;
    }
}