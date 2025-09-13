class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        Integer[] dp = new Integer[m];
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < m ; j ++){
                if(dp[j] == null){
                    if(s[j]>=g[i]){
                        count++;
                        dp[j] = 1;
                        break;
                    }

                } 
                
            }
        }
        return count;
        
    }
}