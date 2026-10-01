class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length-1;
        int i =0 ;
        while(i<=n){
            if(nums[i] == 0){
                break;
            }
            i = nums[i]+i;
        }
        return i >=n ;
    }
}
