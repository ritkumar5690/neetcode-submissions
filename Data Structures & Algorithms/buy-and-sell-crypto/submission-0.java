class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <=1) return 0;
        int rightMax = prices[prices.length-1];
        int leftMin = prices[0];
        int ans = 0;
        int i =0,j = prices.length-1;
        int l = 0;
        while(l<=j){
            if(leftMin > prices[i]){
                leftMin = prices[i];
                l = i;
            }
            i++;
            if(rightMax < prices[j]){
                rightMax = prices[j];
            }
            int profit = rightMax - leftMin;

            ans = ((profit > ans) )? profit:ans;
            j--;

        }
        return ans;
    }
}
