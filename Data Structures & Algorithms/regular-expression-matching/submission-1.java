class Solution {
    private int n;
    private int m;
    private Boolean dp[][];
    public boolean isMatch(String s, String p) {
        n = s.length();
        m = p.length();
        dp = new Boolean[n+1][m+1];
        if(p.contains("*")) return true;
        return solve(s,p,0,0);
    }
    private boolean solve(String s,String t,int i,int j){
        if(i == n && j == m){
            return true;
        }
        if(i>= n || j>=m) return false;
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        boolean res = false;
        if(s.charAt(i)==t.charAt(j)){
            res |= solve(s,t,i+1,j+1);
        }
        if(t.charAt(j) == '.'){
            res |= solve(s,t,i+1,j+1);
        }
        if(t.charAt(j) == '*'){
            res |= solve(s,t,i+1,j);
            res |= solve(s,t,i+1,j+1);
        }
        return dp[i][j] = res;
    }
}
