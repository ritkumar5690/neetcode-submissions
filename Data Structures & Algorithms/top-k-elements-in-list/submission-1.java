class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]) + 1;
                map.put(nums[i],val);
            }
            else{
                map.put(nums[i],1);
            }
            
        }
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(); 
        for(int i =0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                list.add(nums[i]);
            }
            set.add(nums[i]);
        }
        List<Integer> res = new ArrayList<>();
        for(int i =0;i<list.size();i++){
            if(map.get(list.get(i)) >= k){
                res.add(list.get(i));
            }
        }
        int[] arr = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i); 
        }
        return arr;
    }
}
