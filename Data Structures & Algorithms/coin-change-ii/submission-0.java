class Solution {
    private int dp[][];
    private int n;
    public int change(int amount, int[] coins) {
        n = coins.length;
        dp = new int[n + 1][amount + 1];
        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }

        int res = solve(coins, amount, 0, 0);
        return res;
    }
    private int solve(int[] coins, int amount, int i, int sum) {
        if (sum == amount) {
            return 1;
        }

        if (sum < 0 || sum > amount || i >= coins.length) {
            return 0;
        }

        if (dp[i][sum] != -1) {
            return dp[i][sum];
        }

        int take = solve(coins, amount, i, sum + coins[i]);

        int skip = solve(coins, amount, i + 1, sum);

        return dp[i][sum] = (take+ skip);
    }
}
