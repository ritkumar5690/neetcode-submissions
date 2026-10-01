class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;
        int jump = nums[i];
        int choice = jump;
        while(i<=choice && i< nums.length){
            choice = Math.max(choice,i+nums[i]);
            if(choice>=nums.length-1){
                return true;
            }
            i++;
        }
        return false;
    }
}
