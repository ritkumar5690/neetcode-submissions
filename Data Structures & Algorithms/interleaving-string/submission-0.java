class Solution {
    private int n;
    private int m;
    private int l;

    public boolean isInterleave(String s1, String s2, String s3) {
        n = s1.length();
        m = s2.length();
        l = s3.length();
        if(l == 0 && n ==0 && m == 0) return true;
        if((l > 0 && (n == 0 || m ==0)) || l == 0) return false;
        return solve(s1,s2,s3,0,0,0);
    }
    private boolean solve(String s1, String s2, String s3,int i,int j,int k){
        if(i == n && j == m && k == l){
            return true;
        }
        if(k >= l){
            return false;
        }
        
        boolean first = false;
        boolean second = false;
        if(i<n && j<m &&  s1.charAt(i) == s3.charAt(k) && s2.charAt(j) == s3.charAt(k)){
           first =  solve(s1,s2,s3,i+1,j,k+1);
           second = solve(s1,s2,s3,i,j+1,k+1);
        }
        else if(i<n &&  s1.charAt(i) == s3.charAt(k)){
          first = solve(s1,s2,s3,i+1,j,k+1);
        }
        else if(j<m && s2.charAt(j) == s3.charAt(k)){
            second = solve(s1,s2,s3,i,j+1,k+1);
        }
        return first || second;
    }
}
