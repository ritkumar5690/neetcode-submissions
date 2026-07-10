class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxleft = 0;
        int maxRight = 0;
        int water = 0;
        while (i < j) {
            if (height[i] < height[j]) {
                if (maxleft <= height[i]) {
                    maxleft = height[i];
                } else {
                    water += maxleft - height[i];
                }
                i++;
            } else {
                if (maxRight <= height[j]) {
                    maxRight = height[j];
                } else {
                    water += maxRight - height[j];
                }
                j--;
            }
        }

        return water;
    }
}
