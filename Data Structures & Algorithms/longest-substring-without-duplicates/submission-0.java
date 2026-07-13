class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        int ans = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                set = new HashSet<>();
                ans = (ans>count) ? ans: count;
                count = 1;
                set.add(ch);
            }
            else{
                set.add(ch);
                count++;
            }
        }
        return (ans>count) ? ans: count;
    }
}
