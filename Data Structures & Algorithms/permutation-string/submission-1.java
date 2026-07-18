class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        for(int i =0;i<s2.length();i++){
            int count[] = new int[26];
            boolean flag = true;
            if(!s1.contains(String.valueOf(s2.charAt(i)))){
                continue;
            }
            int j = 0;
            for(;j<s1.length();j++){
                if(j+i >= s2.length()){
                    break;
                }
                count[s2.charAt(j+i)-'a']++;
                count[s1.charAt(j)-'a']--;
            }
            for(int l =0;l<26;l++){
                if(count[l] !=0) flag = false;
            }
            if(flag && j == (s1.length())){
                return true;
            }

        }
        return false;
    }
   
}
