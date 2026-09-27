class Solution {
    private int n;
    private Map<Integer,String> map;
    public int findTargetSumWays(int[] nums, int target) {
        n = nums.length;
        return solve(nums,0,0,target);
    }
    private int solve(int[] nums, int i,int sum,int target){
        if(i == n && sum == target){
            return 1;
        }
        if(i >= n){
            return 0;
        }
        
        // String key = i+ "" + sum;
        int a = solve(nums,i+1,sum+nums[i],target);
        int b = solve(nums,i+1,sum-nums[i],target);
        return a+b;
    }
}
