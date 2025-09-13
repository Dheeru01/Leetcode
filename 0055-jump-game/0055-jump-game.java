class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max_ind = 0;
        for(int i=0; i<n; i++){
            
            if(i > max_ind) return false;
            max_ind = Math.max(max_ind, i + nums[i]);
        }

        return true;
    }
}

/*
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
*/
