class Solution {
    private int[] dp;
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,0);
    }
    private int solve(int n,int i){
        if(i >= n-1){
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i] = solve(n,i+1) + solve(n,i+2);
    }
}
