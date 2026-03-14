class Solution {
    ArrayList<String> happy = new ArrayList<>();

    public void generateHappyString(int n,StringBuilder x){
        if(x.length()==n){
            happy.add(x.toString());
            return;
        }
        if(x.charAt(x.length()-1)=='a'){
            x.append('b');
            generateHappyString(n,x);
            x.deleteCharAt(x.length()-1);
            x.append('c');
            generateHappyString(n,x);
             x.deleteCharAt(x.length()-1);
        } else if(x.charAt(x.length()-1)=='b'){
            x.append('c');
            generateHappyString(n,x);
            x.deleteCharAt(x.length()-1);
            x.append('a');
            generateHappyString(n,x);
             x.deleteCharAt(x.length()-1);
        } else if(x.charAt(x.length()-1)=='c'){
            x.append('a');
            generateHappyString(n,x);
            x.deleteCharAt(x.length()-1);
            x.append('b');
            generateHappyString(n,x);
             x.deleteCharAt(x.length()-1);
        }
       
    }
    public String getHappyString(int n, int k) {
        StringBuilder s = new StringBuilder();
        s.append('a');
        generateHappyString(n,s);
        s.deleteCharAt(s.length()-1);

        s.append('b');
        generateHappyString(n,s);
        s.deleteCharAt(s.length()-1);

        s.append('c');
        generateHappyString(n,s);
        // s.remove(s.length()-1);

        Collections.sort(happy);
       if(happy.size()<k){
        return "";
       }
       return happy.get(k-1);
    }
}