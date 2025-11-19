class Solution {

    public static boolean isFound(int[] nums, int original){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==original){
                return true;

            }
            else if(nums[mid]>original){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
    public int findFinalValue(int[] nums, int original) {
        int ans=original;
        Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){


        //     for(int j=0;j<nums.length;j++){
        //         if(nums[j]==ans){
        //             ans*=2;

        //         }
        //     }
           
           
        // }
        // return ans;

        //optimised 
        for(int i=0;i<nums.length;i++){
            if(isFound(nums,ans)){
                ans=ans*2;
            }
        }
        return ans;
    }
}