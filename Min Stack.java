class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> st_min = new Stack<>();
    
    public MinStack() {
    }
    
    public void push(int val) {
        if (st_min.empty() || val <= st_min.peek()) {
            st_min.push(val);
        }
        st.push(val);
    }
    
    public void pop() {
        if (st.peek().equals(st_min.peek())) {
            st_min.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return st_min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
