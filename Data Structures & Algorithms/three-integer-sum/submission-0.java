class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for (int k = 0; k < nums.length; k++) {
            int target = 0 - nums[k];
            int num[] = twoSum(nums, target);
            int i = num[0];
            int j = num[1];
            if (i >= 0 && j > 0 || i > 0 && j >= 0) {
                if (i != k && j != k) {
                    List<Integer> list = new ArrayList<>();
                    if (i > k) {
                        list.add(nums[k]);
                        list.add(nums[i]);
                        list.add(nums[j]);
                    }
                    else if(k > j){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                    }
                    else{
                        list.add(nums[i]);
                        list.add(nums[k]);
                        list.add(nums[j]);
                        
                    }

                    res.add(list);
                }
            }
        }
        List<List<Integer>> uniqueList = new ArrayList<>(new LinkedHashSet<>(res));
        return uniqueList;
    }
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[] {i, j};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[] {-1, -1};
    }
}
