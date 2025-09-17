class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        int n = set.size();
        if(n >= 3) {
            set.pollLast();
            set.pollLast();
            
        }
        return set.last();
        
        
    }
}