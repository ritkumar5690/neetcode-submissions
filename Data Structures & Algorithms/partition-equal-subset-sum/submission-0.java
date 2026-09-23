class Solution {
    private int n;
    private Boolean dp[][];
    public boolean canPartition(int[] nums) {
        n  = nums.length;
        int sum = 0;
        
        for(int i =0;i<n;i++){
            sum += nums[i];
        }
        if(sum % 2 != 0) {
            return false;
        }
        dp = new Boolean[n+1][sum/2+1];
        return solve(nums,0,0,sum/2);
    }
    private boolean solve(int[] nums,int i,int sum,int target){
        if(i >= n){
            return (sum == target);
        }
        if(sum == target){
            return true;
        }
        if(dp[i][sum] !=null){
            return dp[i][sum];
        }
        boolean take = false;
        if(sum + nums[i] <= target){
            take = solve(nums,i+1,sum+nums[i],target);
        }
        dp[i][sum] = take || solve(nums,i+1,sum,target);
        return dp[i][sum];
    }
}
