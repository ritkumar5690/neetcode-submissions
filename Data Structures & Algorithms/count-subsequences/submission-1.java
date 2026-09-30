class Solution {
    private int n;
    private int m;
    private int dp[][];
    public int numDistinct(String s, String t) {
        n = s.length();
        m = t.length();
        if(m>n) return 0;
        dp = new int[n+1][m+1];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        
        return solve(s,t,0,0);
        
    }
    private int solve(String s,String t,int i,int j){
        if(j == m){
            return 1;
        }
        if(i == n ){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int take =0;
        if(s.charAt(i) == t.charAt(j)){
            take = solve(s,t,i+1,j+1);
        }
        int skip = solve(s,t,i+1,j);
        return dp[i][j] = take + skip;
    }
}
