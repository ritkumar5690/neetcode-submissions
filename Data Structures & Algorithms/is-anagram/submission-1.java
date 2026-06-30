class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[] = new int[26];
        if(s.length() != t.length()) return false;
        for(int i =0;i<s.length() ;i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int i : freq) if(i != 0) return false;
        return true;

        
    }
    // return sortStr(s).equals(sortStr(t));
    // private String sortStr(String s){
    //     int freq[] = new int[125];
    //     for(int i =0;i<s.length();i++){
    //         char ch = s.charAt(i);
    //         int val = (int)ch;
    //         freq[val]++;
    //     }
    //     String str = "";
    //     for(int i =0;i<125;i++){
    //         for(int j =0;j<freq[i];j++){
    //             str = str + (char)i;
    //         }
    //     }
    //     return str;
    // }
}
