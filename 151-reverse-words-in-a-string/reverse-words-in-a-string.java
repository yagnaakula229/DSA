class Solution {
    public String reverseWords(String s) {
        Stack<String> st=new Stack<>();
        for(String word:s.trim().split("\\s+")){

            // s.trim()-> removes trailing spaces
            //i.e "  hello"-> "hello"
            //.split("//s+")  used to seperate with spaces 
            st.push(word);

        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            String popped=st.pop();
            ans.append(popped);
            ans.append(" ");
            
        }
        
        return ans.toString().trim();//trim ->  " head "-> "head"
    }
}