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
                first++;
                for(int j = first;j<=i;j++){
                if(set.contains(s.charAt(j))){
                    first++;
                }
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
