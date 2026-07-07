class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int prefix[] = new int[n];
        prefix[0] = 1;
        int suffix[] = new int[n];
        suffix[n-1] = 1; 

        for(int i = 0;i<n;i++){
            if(i-1 >= 0){
                prefix[i] = prefix[i-1] * nums[i-1];    
            }
            if(n-i < n){
                suffix[n-1-i] = suffix[n-i] * nums[n-i];
            }
        }
        for(int i =0;i<n;i++){
            res[i] = prefix[i] * suffix[i];
        }
        return res;
    }
}  
