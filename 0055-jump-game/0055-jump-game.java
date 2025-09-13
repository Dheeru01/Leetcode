class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] list = new boolean[n];
        list[n-1] = true;
        for(int i=n-2; i>=0 ; i--){
            if(nums[i] != 0){
                for(int j=1;j<=nums[i];j++){
                    if(list[i+j] == true){
                        list[i] = true;
                        break;
                    }
                }
            }
            
        }

        return list[0];
    }
}