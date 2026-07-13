class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int count[] = new int[1001];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        List<Integer> list = new ArrayList<>(); 
        for(int i =0;i<1001;i++){
            if(count[i] >=k ) list.add(i);
        }
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i); 
        }
        return arr;
    }
}
