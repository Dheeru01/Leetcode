class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prefix_height = new int[n];
        
        prefix_height[0] = height[0];
        for(int i=1; i<n; i++){
            if(height[i] <= prefix_height[i-1]){
                prefix_height[i] = prefix_height[i-1];
            }
            else{
                prefix_height[i] = height[i];
            }

        } 

        int[] suffix_height = new int[n];
        suffix_height[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            if(height[i] <= suffix_height[i+1]){
                suffix_height[i] = suffix_height[i+1];
            }
            else{
                suffix_height[i] = height[i];
            }

        } 
        int trap = 0;
        for(int i=0; i<n; i++){
            int left_max = prefix_height[i];
            int right_max = suffix_height[i];
            trap += Math.min(left_max,right_max) - height[i];
        }
        return trap;
        
    }
}