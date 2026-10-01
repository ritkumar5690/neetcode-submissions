class Solution {
    private int n;
    public boolean canJump(int[] nums) {
        n = nums.length-1;
        return solve(nums,0) ;
    }
    private boolean solve(int[] nums, int i){
        if(i >= n){
            return true;
        }
        if(nums[i] == 0){
            return false;
        }
        boolean res = false;
        for(int j = 1;j<=nums[i];j++){
            res |= solve(nums,j+i);
        }
        return res;
    }
}
