class Solution {
    private int n;
    private int dp[];
    public int minCostClimbingStairs(int[] cost) {
        n = cost.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(solve(cost, 0), solve(cost, 1));
    }
    private int solve(int[] nums,int i){
        if(i >= n){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        return dp[i] = nums[i] + Math.min( solve(nums,i+1), solve(nums,i+2));
    }
}
