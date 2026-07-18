class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int j = s1.length() -1;
        if(s1.length() > s2.length()) return false;
        for(int i =0;i<s2.length();i++){
            int count[] = new int[26];
            int k = i;
            int cur=0;
            boolean flag = true;
            while(k<=j && k < s2.length()){
                count[s2.charAt(k)-'a']++;
                count[s1.charAt(cur)-'a']--;
                k++;
                cur++;
            }
            for(int l =0;l<26;l++){
                if(count[l] !=0) flag = false;
            }
            if(flag){
                return true;
            }
            j++;

        }
        return false;
    }
}
