class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm1 = new HashMap<>();
        HashMap<Character,Character> hm2 = new HashMap<>();
        
        if(s.length()!=t.length())
        return false;
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2= t.charAt(i);
            hm1.put(ch1,ch2);
            hm2.put(ch2,ch1);
        }
        if(hm1.size()!=hm2.size()) return false;
        for(int i=0;i<s.length();i++){
            char ch1 =s.charAt(i);
            char ch2 = t.charAt(i);
            if(ch1!=hm2.get(ch2))
            return false;
        }

        return true;
    }
}