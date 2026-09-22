class Solution {
    private int[][] dp;
    public int countSubstrings(String s) {
        int n = s.length();
        dp = new int[n+1][n+1];
        for(int i[] : dp){
            Arrays.fill(i,-1);
        }
        int count = 0;
        for(int i =0;i<n;i++){
            for(int j = i;j<n;j++){
                if(solve(s,i,j) == 1){
                    count++;
                }
            }
        }
        
        return count;
    }
    private int solve(String s,int i,int j){
        if(i>=j){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        if(s.charAt(i)==s.charAt(j) ){
            return dp[i][j] = solve(s,i+1,j-1);
        }
        
        return dp[i][j] = 0;
    }
}
