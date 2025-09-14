class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>hm1=new HashMap<>();
        HashMap<Character,Character>hm2=new HashMap<>();
        boolean ans=true;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            // atfirst a hashmap doesnt contain any element do ch1 is not in hm1 therefore it is added to hm1 
            if(!hm1.containsKey(ch1) && !hm2.containsKey(ch2)){
                hm1.put(ch1,ch2);
                hm2.put(ch2,ch1);
            }
            // if ch1 is in hm1 again then  its value should be same as before when it is repeated for first time else it is not isomorphic
            else if(hm1.containsKey(ch1)&&hm1.get(ch1)!=ch2){
                ans=false;
            }
            else if(hm2.containsKey(ch2)&&hm2.get(ch2)!=ch1){
                ans=false;
            }
        }
        return ans;

       
    }
}