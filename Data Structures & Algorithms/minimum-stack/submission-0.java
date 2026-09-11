class MinStack {
    private List<Integer> list;
    private Stack<Integer> st;
    public MinStack() {
        list = new ArrayList<>();
        st = new Stack<>();
    }
    
    public void push(int val) {
        list.add(val);
        if(st.isEmpty() || val <= st.peek()){
            st.push(val);
        }
    }
    
    public void pop() {
        int n = list.size();
        if(n ==0 ) return;

        int temp = list.get(n-1);

        if(st.peek() == temp){
            st.pop();
        }
        list.remove(list.size()-1);
    }
    
    public int top() {
       return list.get(list.size()-1);
    }
    
    public int getMin() {
        return st.peek();
    }
}
