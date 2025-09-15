class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm  = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<Character> list = new ArrayList<>(hm.keySet());

//this type (below statement) is called lambda expression 
//list.sort() expects a Comparator (a function that compares two elements and returns:
// < 0 if first < second
// 0 if equal
// > 0 if first > second).
// Our lambda (ch1, ch2) -> hm.get(ch2) - hm.get(ch1) does exactly that:
// If ch2's frequency is greater, it comes before ch1
        list.sort((ch1,ch2) -> hm.get(ch2)-hm.get(ch1));
        for(char c : list){
            for(int i=0;i<hm.get(c);i++){
                sb.append(c);
            }
        }
        return sb.toString();

          
    }
}