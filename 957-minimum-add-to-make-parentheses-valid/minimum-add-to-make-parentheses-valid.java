class Solution {
   
    public int minAddToMakeValid(String s) {
        int open=0;
        int insertions=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
               
               open++;
            }
          
            else{
                if(open>0){
                open--;
                }
                else if(open<=0){
                   insertions++;
                }
                
            }
         
        }

        return open+insertions;
    }
}