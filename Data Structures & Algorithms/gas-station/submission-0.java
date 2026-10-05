class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        for(int i =0;i<n;i++){
            int j = i;
            
            int count = 0;
            int val = 0;
            while(count< n){
                
                val += gas[j] - cost[j];
                if(val < 0){
                    break;
                }
                j = (j + 1) % n;
                count++;
              }
              if (count == n) {
                return i;
              }
        }
        return-1;
    }
}
