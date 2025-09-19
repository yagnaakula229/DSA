class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n =s.length();

        // skip if there are leading zeroes;
        while(i<n && s.charAt(i)==' '){
            i++;
        }

        // handling sign 
        int sign=1;
        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            sign=(s.charAt(i)=='-'?-1:1);
            i++;
        }

        // conversion of digiits
        long num=0;

        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            num = num*10+digit;

            if(sign==1  && num>Integer.MAX_VALUE){
             return Integer.MAX_VALUE;
            }
            if(sign<0 && -num<Integer.MIN_VALUE){
             return Integer.MIN_VALUE;
            }
            i++;

        }

        return (int)(sign*(num));
    }
}