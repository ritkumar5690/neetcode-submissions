class Solution {
    public int findTargetSumWays(int[] arr, int target) {
        int Totalsum = 0;
        for(int i = 0;i<arr.length;i++){
            Totalsum += arr[i];
        }
        if (Totalsum < Math.abs(target) || (target + Totalsum) % 2 != 0) return 0;
        int sum = (Totalsum + target)/2;
        int t[] = new int[sum+1];
        t[0] = 1;
        for(int num : arr){
            for(int j = sum;j>=num;j--){
                t[j] += t[j-num];
            }
        }
        
        return t[sum];
    }
}