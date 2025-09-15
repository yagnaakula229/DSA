class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Stack<String> st = new Stack<>();
        
        String[] textArr = text.split(" ");

        for(String word:textArr){
            st.push(word);
        }
        int cnt=st.size();

        for(String word:textArr){
            for(int i=0;i<brokenLetters.length();i++){
                char ch = brokenLetters.charAt(i);
                if(word.contains(String.valueOf(ch))){
                cnt--;
                break;
            }
            }
            
        }
        return cnt;
    }
}