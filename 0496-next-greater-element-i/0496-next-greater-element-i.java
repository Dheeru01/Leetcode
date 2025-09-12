class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
         
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st= new Stack<>();
        for(int i = n-1 ; i >=0 ; i--){
            if(st.isEmpty()){
                map.put(nums2[i],-1);
                st.push(nums2[i]);
            }
            else if(st.peek() > nums2[i] ){
                
                map.put(nums2[i],st.peek());
                st.push(nums2[i]);

            }
            else if(st.peek() <= nums2[i]){
                while(!st.isEmpty() && st.peek() <= nums2[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    map.put(nums2[i],-1);
                    st.push(nums2[i]);
                }
                else{
                    map.put(nums2[i],st.peek());
                    st.push(nums2[i]);
                }
            }
        }
        int m = nums1.length;
        int[] new_arr = new int[m];
        for(int i=0; i < m ; i ++){
            new_arr[i] = map.get(nums1[i]);
        }

        return new_arr;

        
    }
}