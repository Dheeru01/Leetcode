class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        Integer[] list = new Integer[n];
        list[n - 1] = 0;  

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != 0) {
                int min_jump = Integer.MAX_VALUE;

                for (int j = nums[i]; j >= 1; j--) {
                    if ((i + j) >= n - 1) {
                        min_jump = 1;  
                        break;
                    } else if (list[i + j] != null) {  
                        min_jump = Math.min(min_jump, 1 + list[i + j]);
                    }
                }

                if (min_jump != Integer.MAX_VALUE) {
                    list[i] = min_jump;
                }
            }
        }

        return list[0];
    }
}
