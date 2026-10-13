class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int n = triplets.length;
        int a=0;
        int b = 0;
        int c = 0;

        for(int i =0;i<n;i++){
            a = Math.max(a,triplets[i][0]);
            b = Math.max(b,triplets[i][1]);
            c = Math.max(c,triplets[i][2]);
        }
        return a == target[0] && b == target[1] && c == target[2];
    }
}
