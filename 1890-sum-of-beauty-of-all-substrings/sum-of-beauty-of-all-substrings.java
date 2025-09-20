// class Solution {
//     public static int diff(String sub){
//         HashMap<Character,Integer> hm = new HashMap<>();
//         for(int i=0;i<sub.length();i++){
//             char ch = sub.charAt(i);
//             hm.put(ch,hm.getOrDefault(ch,0)+1);

//         }
//         ArrayList<Character> ls = new ArrayList<>(hm.keySet());
//         ls.sort((ch1,ch2)->hm.get(ch2)-hm.get(ch1));
//         int diff = hm.get(ls.get(0)) - hm.get(ls.get(ls.size()-1));

//         return diff;
//     }

//     public int beautySum(String s) {



        ///  *****     Time Limit Exceeded   *****  
// 40 / 57 testcases passed /// 
//         int sum=0;
//         for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                 String sub = s.substring(i,j+1);
//                 sum+=diff(sub);
//             }
//         }
//         return sum;
//     }
// }



class Solution{
    public int beautySum(String s)
    {
        int n =s.length();
        int res=0;
        int diff=0;
        for(int i=0;i<s.length();i++){
            
            int freq[] = new int[26];
            Arrays.fill(freq,0);
            for(int j=i;j<s.length();j++){

                int maxFreq=0;
                int minFreq=n;
                char ch = s.charAt(j);
                freq[ch-'a']++;

                for(int f:freq){
                if(f>0){
                maxFreq=Math.max(maxFreq,f);
                minFreq=Math.min(minFreq,f);
                }
                }
                diff=maxFreq-minFreq;
                res+=diff;
            }
        }
        return res;
    }
}