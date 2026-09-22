class Solution {
    private int dp[][];
    private int n;
    public int coinChange(int[] coins, int amount) {
        n = coins.length;
        dp = new int[n+1][amount+1];
        for(int i[] : dp){
            Arrays.fill(i,-1);
        }
        
        int res = solve(coins,amount,0,0);
        return (res == Integer.MAX_VALUE/2) ? -1: res;
    }
    private int solve(int[] nums,int amount,int i,int sum){
        
        if(sum == amount){
            return 0;
        }
        if (sum > amount || i >= n) {
            return Integer.MAX_VALUE/2;
        }
        if(dp[i][sum] != -1){
            return dp[i][sum];
        }
        int temp = sum + nums[i];
        
        int take = 1+ solve(nums,amount,i,temp);
        int skip = solve(nums,amount,i+1,sum);
        return dp[i][sum] = Math.min(take,skip);
    }
}
