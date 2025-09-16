class Solution {
    public int maxDepth(String s) {
        int ans=0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(ch);
                ans=Math.max(ans,st.size());
            }
            else if(!st.isEmpty() && ch==')'){
                st.pop();
               
            }
        }
        return ans;
      
    }
}