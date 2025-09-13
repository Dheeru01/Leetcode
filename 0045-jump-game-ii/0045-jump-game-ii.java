class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int max_ind = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            if(max_ind >= n-1) break;
            if(i > max_ind) return 0;
            max_ind = Math.max(max_ind, i + nums[i]);
            count++;
        }

        return count;
    }
}
