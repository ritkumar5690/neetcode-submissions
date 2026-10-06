class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Arrays.sort(hand);
        int n = hand.length;
        if (n % groupSize != 0) {
            return false;
        }

        int count[] = new int[1001];
        for(int i :hand){
            count[i]++;
        }
        
        for (int card = 0; card <= 1000; card++) {

            if (count[card] == 0) {
                continue;
            }
            int freq = count[card];
            for (int j = 0; j < groupSize; j++) {

                int current = card + j;

                if (current > 1000 || count[current] < freq) {
                    return false;
                }

                count[current] -= freq;
            }
        }
        return true;
    }
}
