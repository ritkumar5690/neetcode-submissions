class Solution {
    private int[][] dp;
    
    public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        return solve(m,n,0,0);
    }
    private int solve(int m,int n,int i,int j){
        if(i == m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int a =0,b=0;
        if(i < m-1){
            a = solve(m,n,i+1,j);
        }
        if(j<n-1){
            b = solve(m,n,i,j+1);
        }
        return dp[i][j] =  a + b;
    }
}
