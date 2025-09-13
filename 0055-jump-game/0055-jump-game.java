class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max_ind = 0;
        for(int i=0; i<n; i++){
            
            if(i > max_ind) return false;
            if((i + nums[i]) > max_ind ){
                max_ind += nums[i];
            }
        }

        return true;
    }
}