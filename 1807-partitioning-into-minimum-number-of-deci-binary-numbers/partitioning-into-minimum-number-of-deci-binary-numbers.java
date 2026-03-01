class Solution {
    public int minPartitions(String n) {
        int maxi= -1;
        for(char ch: n.toCharArray()){
            int x = ch-'0';
            maxi = Math.max(x,maxi);
        }
        return maxi;
    }
}