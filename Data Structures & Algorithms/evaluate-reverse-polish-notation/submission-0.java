class Solution {
    public int evalRPN(String[] token) {
        Deque<Integer> st = new ArrayDeque<>();
        for(int i =0;i<token.length;i++){
            if(token[i].equals("+") ||
                token[i].equals("-") ||
                token[i].equals("*") ||
                token[i].equals("/")){
                int b = st.pop();
                int a = st.pop();
                int c = 0;
                if(token[i].equals("+")) c = a +b;
                if(token[i].equals("-")) c = a - b;
                if(token[i].equals("*")) c = a * b;
                if(token[i].equals("/")) c = a / b;
        
                st.push(c); 
            }
            else{
                st.push(Integer.parseInt(token[i]));
            }
        }
        return st.pop();
    }
}
