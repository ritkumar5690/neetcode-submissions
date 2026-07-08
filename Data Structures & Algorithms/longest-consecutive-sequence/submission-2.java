class Solution {
    public int longestConsecutive(int[] nums) {
        int len =nums.length; 
        if(len < 1) return 0;
        int res =1;
        Arrays.sort(nums);
        int count = 1;
        for(int i =1;i<len;i++){
            if(nums[i] == nums[i-1]+1){
                count++;
            }
            else if(nums[i] == nums[i-1]){
        
            }
            else{
               res = (res < count) ? count : res;  
               count = 1;

            }
        }
        return (res < count) ? count : res;
    }
}
