class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        Integer[][] dp = new Integer[n][amount+1];
        return (f(n-1,coins,amount,dp) == 100000)? -1 :f(n-1,coins,amount,dp) ;
        
    }
    int f(int i ,int[] coins, int amount,Integer[][] dp ){
        if(amount == 0){
            return 0;
        }
        if(i==0){
            
            if(amount % coins[0] == 0) return amount/coins[0];
            
            return 100000;
        }
        
        
        if(dp[i][amount] != null){
            return dp[i][amount];
        }

        
        int not_pick = f(i-1,coins,amount,dp);
        int pick =100000; 
        if(amount >= coins[i]){
            pick = 1 + f(i,coins,amount-coins[i],dp);
        }

        return dp[i][amount] = Math.min(pick,not_pick);
    }
}