class Solution {
    public boolean search(int[] nums, int target) {
        return binary_search(0,nums.length - 1, target , nums);
        
    }

    private boolean binary_search(int low , int high , int target , int[] nums){
        if(low > high) return false;

        int mid = low + (high-low)/2;

        
        //for duplicates
        if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
            return binary_search(low + 1, high - 1, target, nums);
        }

        if(nums[low] <= nums[mid]){
            //left is sorted
            if(nums[mid] ==  target || nums[low] == target) return true;
            else if(nums[low] < target && target < nums[mid]){
                return binary_search(low , mid-1 , target , nums);

            }
            else{
                return binary_search(mid + 1 , high , target , nums);
            }
        }

        else {
            //right is sorted

            if(nums[high] == target || nums[mid] == target) return true;
            else if(target < nums[high] && target > nums[mid]){
                return binary_search(mid+1 , high , target , nums);
            }
            else{
                return binary_search(low , mid-1 , target , nums);
            }
        }

        

    }

    
}