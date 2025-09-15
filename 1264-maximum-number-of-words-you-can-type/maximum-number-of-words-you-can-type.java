class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        



        
        // Stack<String> st = new Stack<>();
        
        // String[] textArr = text.split(" ");

        // for(String word:textArr){
        //     st.push(word);
        // }
        // int cnt=st.size();

        // for(String word:textArr){
        //     for(int i=0;i<brokenLetters.length();i++){
        //         char ch = brokenLetters.charAt(i);
        //         if(word.contains(String.valueOf(ch))){
        //         cnt--;
        //         break;
        //     }
        //     }
            
        // }
        // return cnt;



         Set<Character> brokenSet = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            brokenSet.add(c);
        }

        int count = 0;
        for (String word : text.split(" ")) {
            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (brokenSet.contains(c)) {
                    canType = false;
                    break;
                }
            }
            if (canType) count++;
        }
        return count;
    }
}