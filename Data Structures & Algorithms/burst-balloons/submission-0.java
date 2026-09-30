class Solution {
    private int n;
    private int dp[];
    public int maxCoins(int[] nums) {
        n = nums.length;
        if(n == 1) return nums[0];
        arr = new int[n + 2];

        arr[0] = 1;
        arr[n + 1] = 1;

        for (int i = 0; i < n; i++) {
            arr[i + 1] = nums[i];
        }
        dp = new int[n+1];
         Arrays.fill(dp,-1);
        
        List<Integer> list = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        int res = 0;
        for(int i =0;i<n;i++){
            res = Math.max(res,solve(list,i));
        }
        return res;
    }
    private int solve(List<Integer> list,int i){
        if(list.size() == 0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int pro = 1;
        if(i-1 < 0 && i+1 > n-1){
            pro = 1* list.get(i)* 1 ;
            list.remove(i); 
        }
        else if(i-1 < 0 && i+1 <= n-1){
            pro = 1* list.get(i)* list.get(i+1);
            list.remove(i); 
        }
        else if(i-1 >= 0 && i+1 > n-1){
            pro = list.get(i-1)* list.get(i)*1;
            list.remove(i);
        }
        return dp[i] = pro + solve(list,i);
    }
}
