class Solution {
    private int n;
    private int dp[];
    public boolean canJump(int[] nums) {
        n = nums.length-1;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(nums,0) ;
    }
    private boolean solve(int[] nums, int i){
        if(i >= n){
            return true;
        }
        if(nums[i] == 0){
            return false;
        }
        if (dp[i] != -1) {
            return dp[i] == 1;
        }
        boolean res = false;
        for(int j = 1;j<=nums[i] && i + j <= n;j++){
            res |= solve(nums,j+i);
            if (res) {
                 dp[i] = 1;
                return true;
            }
        }
        dp[i] = 0;
        return res;
    }
}
