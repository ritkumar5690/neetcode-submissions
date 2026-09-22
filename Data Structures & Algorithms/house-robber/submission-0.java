class Solution {
    private int[] dp;
    private int n;
    public int rob(int[] nums) {
        n = nums.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(nums,0);
    }
    private int solve(int[] nums, int i){
        if(i >= n){
            return 0;
        }
        if(dp[i] !=-1){
            return dp[i];
        }
        int take = nums[i] + solve(nums,i+2);
        int skip = solve(nums,i+1);
        return Math.max(take,skip);
    }
}
