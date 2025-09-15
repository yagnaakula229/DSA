class Solution {
    public boolean rotateString(String s, String goal) {
        // HashMap<Character,Integer> hm = new HashMap<>();
        // if(s.length()!=goal.length()){
        //     return false;
        // }
        // for(int i=0;i<goal.length();i++){
        //     char ch = s.charAt(i);
        //     hm.put(ch,i);
        // }

        // int idx = hm.get(goal.charAt(0));
        // StringBuilder sb = new StringBuilder();
        // sb.append(s.substring(idx,goal.length()));
        // sb.append(s.substring(0,idx));
        // if(sb.toString().equals(goal)){
        //     return true;
        // }
        // return false;


         if(s.length()!=goal.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            for(int j=0;j<goal.length();j++){
                if(s.contains(goal.substring(0,j))){
                    if(s.contains(goal.substring(j,goal.length()))){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}