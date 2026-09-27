class Solution {
    private int n;
    private HashMap<String, Integer> map;
    public int findTargetSumWays(int[] nums, int target) {
        n = nums.length;
        map = new HashMap<>();
        return solve(nums,0,0,target);
    }
    private int solve(int[] nums, int i,int sum,int target){
        if(i == n && sum == target){
            return 1;
        }
        if(i >= n){
            return 0;
        }
        
        String key = i+ "," + sum;
         if (map.containsKey(key)) {
            return map.get(key);
        }
        int a = solve(nums,i+1,sum+nums[i],target);
        int b = solve(nums,i+1,sum-nums[i],target);
        map.put(key, a+b);
        return a+b;
    }
}
