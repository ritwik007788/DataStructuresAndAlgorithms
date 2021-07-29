//Leetcode 155

-----------------------------------O(n) space solution-----------------------------------
  
  class MinStack {

    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    Stack<Integer> st =  new Stack<>();
    Stack<Integer> minSt = new Stack<>();
    
    public void push(int val) {
        st.push(val);
        if(minSt.isEmpty() || minSt.peek()>=val) minSt.push(val);
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        int temp = st.pop();
        if(minSt.peek() == temp) minSt.pop();
        return;
        
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        return st.peek();
        
    }
    
    public int getMin() {
        if(minSt.isEmpty()) return -1;
        return minSt.peek();
    }
}
