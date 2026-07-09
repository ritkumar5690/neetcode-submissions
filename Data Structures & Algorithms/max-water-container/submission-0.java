class Solution {
    public int maxArea(int[] heights) {
        int i =0;
        int j = heights.length-1;
        int ans = 0;
        while(i < j){
            int height = heights[i] < heights[j] ? heights[i] : heights[j];
            int area = height * (j-i);
            ans = ans < area ? area:ans ;
            if(heights[i] < heights[j]) i++;
            else{
                j--;
            }
        }
        return ans;
    }
}
