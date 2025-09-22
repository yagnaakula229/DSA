class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        int br[] = new int[hm.size()];
        int idx=0;
        for(int n:hm.values()){
            br[idx]=n;
            idx++;
        }
        int max= Arrays.stream(br).max().getAsInt();
        int cnt=0;
        for(int n:nums){
            if(hm.get(n)==max){
                cnt++;
            }
        }
        return cnt;

    }
}