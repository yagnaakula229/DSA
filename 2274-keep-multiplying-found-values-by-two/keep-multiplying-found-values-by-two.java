class Solution {
    public int findFinalValue(int[] nums, int original) {
        int ans=original;
        for(int i=0;i<nums.length;i++){


            for(int j=0;j<nums.length;j++){
                if(nums[j]==ans){
                    ans*=2;
                    
                }
            }
           
           
        }
        return ans;
    }
}