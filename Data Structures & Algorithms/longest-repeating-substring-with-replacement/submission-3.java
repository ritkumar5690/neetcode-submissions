class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int max = 0;
        int count[] = new int[26];
        int j =0;
        int i = 0;
        while(i<s.length()){

           count[s.charAt(i)-'A']++;
           max = Math.max(max, count[s.charAt(i)-'A']);

           while(((i-j+1) - max) > k){
              count[s.charAt(j)-'A']--;
              j++;
           }

           maxLen = Math.max(maxLen, i-j+1);
           i++; 
        }
        return maxLen;
    }
}
