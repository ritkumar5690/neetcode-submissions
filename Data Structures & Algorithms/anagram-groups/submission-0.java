class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res =new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<strs.length;i++){
            if(set.contains(i)) continue;
            List<String> camp = new ArrayList<>();
            camp.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(compare(strs[i],strs[j])){
                    camp.add(strs[j]);
                    set.add(j);
                }
            }
            res.add(camp);
        }
        return res;
    }
    private boolean compare(String s, String t){
        if(s.length() != t.length()) return false;
        int freq[] = new int[26];
        for(int i =0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;

        }
        for(int i=0;i<26;i++){
            if(freq[i] != 0) return false;
        }
        return true;
    }
}
