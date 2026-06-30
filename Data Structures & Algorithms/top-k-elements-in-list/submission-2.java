class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length) return nums;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Queue<Integer> minH = new PriorityQueue<>(
            (a,b) -> map.get(a) - map.get(b)
            );
        for(int n : map.keySet())  {
            minH.add(n);
            if(minH.size() > k){
                minH.poll();
            }
        } 
        int res[] = new int[k];
        for(int i =0;i<k;i++){
            res[i] = minH.poll();

        } 
        return res; 

    }
}
