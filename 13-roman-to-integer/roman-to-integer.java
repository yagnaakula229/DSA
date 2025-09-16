class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int total=0;
        int prevVal=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            int currVal=hm.get(ch);
            if(currVal<prevVal){
                total-=currVal;
            }
            else{
                total+=currVal;
            }
            prevVal=currVal;
        }
        return total;

    }
}