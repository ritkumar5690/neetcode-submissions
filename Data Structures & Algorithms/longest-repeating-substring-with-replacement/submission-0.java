class Solution {
    public int characterReplacement(String s, int k) {
        int count = 0;
        int ans = 0;
        int j =0;
        char ch = s.charAt(0);
        int i = 0;
        for(;i<s.length();i++){
            if(ch != s.charAt(i)){
                count++;
            }
            if(count > k){
                int len = i-j;
                ans = (len > ans)? len:ans;
                while((j+1<s.length()) &&  s.charAt(j)==s.charAt(j+1)){
                    j++;
                }
                j++;
                count = 0;
                ch = s.charAt(j);
            }
        }
        return ans > (i-j)? ans : i-j;
    }
}
