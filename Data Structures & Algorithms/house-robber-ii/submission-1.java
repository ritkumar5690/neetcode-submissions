class Solution {
    private int dp[];
    
    public int rob(int[] nums) {
        int n = nums.length;
        if(n ==1)return nums[0];
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        int first = solve(nums,0,n-1);
        Arrays.fill(dp,-1);
        return Math.max(first, solve(nums,1,n));
        
    }
    private int solve(int[] nums,int i,int n){
        if(i>=n){
            return 0;
        }
        if(dp[i] !=-1){
            return dp[i];
        }
        int take = nums[i] + solve(nums,i+2, n);
        int skip = solve(nums,i+1, n);
        return dp[i] = Math.max(take,skip);
    }
}
