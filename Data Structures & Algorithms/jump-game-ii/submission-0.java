class Solution {
    public int jump(int[] nums) {
       int i = 0;
        int jump = nums[i];
        int count =1;
        int choice = jump;
        while(i<=choice && i< nums.length){
            if(choice<i+nums[i]){
                count++;
            }
            choice = Math.max(choice,i+nums[i]);
            if(choice>=nums.length-1){
                return count;
            }
            i++;
        }
        return count; 
    }
}
