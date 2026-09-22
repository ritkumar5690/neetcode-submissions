class Solution {
    private int count = 0;
    public int countSubstrings(String s) {
        solve(s,0,s.length()-1);
        return count+s.length();
    }
    private int solve(String s,int i,int j){
        if(i>=j){
            
            return 1;
           
        }
        int inner = solve(s,i+1,j-1);
        if(s.charAt(i)==s.charAt(j) && inner == 1){
            count++;
        }
        solve(s,i,j-1);
        solve(s,i+1,j);
        return count;
    }
}
