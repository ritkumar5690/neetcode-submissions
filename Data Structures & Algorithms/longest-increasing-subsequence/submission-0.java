class Solution {
    private int n;
    private int[][] dp;
    public int lengthOfLIS(int[] nums) {
        n = nums.length;
        dp = new int[n][n+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(nums,0,-1);
    }
    private int solve(int[] nums,int i,int prev){
        if(i >=n){
            return 0;
        }
        if(dp[i][prev+1] != -1){
            return dp[i][prev+1];
        }
        int take =0;
        if(prev == -1 || nums[prev] < nums[i]){
            take = 1+ solve(nums,i+1,i);
        }
        int skip = solve(nums,i+1,prev);
        return dp[i][prev+1]= Math.max(take,skip);
    }
}
