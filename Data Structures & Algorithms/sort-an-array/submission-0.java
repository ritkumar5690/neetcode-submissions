class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> minH = new PriorityQueue<>();
        for(int i =0;i<nums.length;i++){
            minH.offer(nums[i]);
        }
        for(int i =0;i<nums.length;i++){
            nums[i] = minH.poll();
        }
        return nums;
    }
}