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
    private int solve(int[] coins, int amount, int i, int sum) {

    if (sum == amount) {
        return 0;
    }

    if (sum > amount || i >= coins.length) {
        return Integer.MAX_VALUE / 2;
    }

    if (dp[i][sum] != -1) {
        return dp[i][sum];
    }

    int take = 1 + solve(
        coins,
        amount,
        i,
        sum + coins[i]
    );

    int skip = solve(
        coins,
        amount,
        i + 1,
        sum
    );

    return dp[i][sum] = Math.min(take, skip);
}
}
