class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = nums[0];
        for(int i =1;i<nums.length;i++){
            sum = Math.max(nums[i],sum+nums[i]);
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum > sum ? maxSum: sum;
    }
}
