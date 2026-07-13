class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0;
        char first = 0;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                set = new HashSet<>();
                int count = i - first;
                while(s.charAt(first)!=s.charAt(i)){
                    first++;
                }
                first++;
                for(int j = first;j<=i;j++){
                    set.add(s.charAt(j));
                }
                ans = (ans>count) ? ans: count;
            }
            else{
                set.add(ch);
            }
        }
        int count = s.length()-1 - first +1;
        return (ans>count) ? ans: count;
    }
}
