class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i =0;
        int j = 1;
        while(true){
            int sum = nums[i] + nums[j];
            if(sum == target){
                return new int[]{i+1, j+1};
               
            }
            else if(sum > target){
                j--;
            }
            else if(sum < target){
                if(j >= nums.length-1){
                    i++;
                }
                else{
                    j++;
                }
            }
        }
    }
}
