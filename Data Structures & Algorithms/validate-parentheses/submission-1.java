class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0;i<s.length();i++){
           char ch1 = s.charAt(i);
           if(!stack.isEmpty() && (ch1 == ')' || ch1 == '}' || ch1 == ']')){
             char ch2 = stack.peek();
             if(ch1== ')' && ch2 == '('){
                stack.pop();
             }
             else if(ch1== '}' && ch2 == '{'){
                stack.pop();
             }
             else if(ch1== ']' && ch2 == '['){
                stack.pop();
             }
             else{
                return false;
             }
           }
           else{
            stack.push(ch1);
           }
        }
         return (stack.isEmpty());
    }
}
