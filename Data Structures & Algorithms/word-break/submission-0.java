class Solution {
    private Boolean[] dp;
    private int n;
    private HashSet<String> has;
    public boolean wordBreak(String s, List<String> wordDict) {
        n = s.length();
        has = new HashSet<>();
        for(int i = 0;i<wordDict.size();i++){
            has.add(wordDict.get(i));
        }
        if(has.contains(s)) return true;
        dp = new Boolean[n+1];
       
        return solve(s,0);

    }
    private boolean solve(String s,int i){
        if(i == n){
            return true;
        }
        if(dp[i] != null){
            return dp[i];
        }
        for(int j =i;j<n;j++){
            String str = s.substring(i,j+1);
            if(has.contains(str) && solve(s,1+j)){
                return dp[i] = true;
            }
        }
        return dp[i] = false;
    }
}
