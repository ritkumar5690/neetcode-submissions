class Solution {
    private int[][] dp;
    private int n;
    private int m;

    public int longestCommonSubsequence(String text1, String text2) {
        n = text1.length();
        m = text2.length();
        dp = new int[n+1][m+1];
        for(int i[] : dp){
            Arrays.fill(i,-1);

        }

        return solve(text1,text2,0,0);
    }
    private int solve(String s, String t,int i,int j){
        if(i>=n || j>=m){
            return 0;
        }
        if(dp[i][j] !=-1){
            return dp[i][j];
        }
        int take = 0;
        if(s.charAt(i) ==t.charAt(j)){
            take = 1+ solve(s,t,i+1,j+1);
        }
        int skip = Math.max(solve(s,t,i+1,j),solve(s,t,i,j+1));
        return dp[i][j] = Math.max(take ,skip);

    }
}
