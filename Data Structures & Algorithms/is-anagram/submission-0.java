class Solution {
    public boolean isAnagram(String s, String t) {

        return sortStr(s).equals(sortStr(t));
    }
    private String sortStr(String s){
        int freq[] = new int[125];
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int val = (int)ch;
            freq[val]++;
        }
        String str = "";
        for(int i =0;i<125;i++){
            for(int j =0;j<freq[i];j++){
                str = str + (char)i;
            }
        }
        return str;
    }
}
