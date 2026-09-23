class Solution {
    public int maxProduct(int[] nums) {
        int res =0;
        for(int i =0;i<nums.length;i++){
            int pro = 1;
            for(int j = i;j<nums.length;j++){
                pro = pro * nums[j];
                res = Math.max(res,pro);
            }
        }
        return res;
    }
}
