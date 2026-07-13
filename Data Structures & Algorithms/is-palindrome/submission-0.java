class Solution {
    public boolean isPalindrome(String s) {
        s = s.replace(" ", "").toLowerCase();
        int end = s.length()-1;
        int start = 0;
        while(start<end){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
             if(!Character.isLetterOrDigit(s.charAt(end))){
                end--;
             }
            if(Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end))){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
