//InterviewBit

public class Solution {
    public int[] prevSmaller(int[] A) {
        Stack<Node> st = new Stack();
        int[] res = new int[A.length];
        for(int i = A.length-1 ; i >=0 ; i--){
            while(!st.isEmpty() && st.peek().data > A[i]){
                res[st.pop().index] = A[i];
            }
            st.push(new Node(A[i],i));
        }
        for(int i = 0 ; i < res.length ; i++){
            if(res[i]==0) res[i] = -1;
        }
        return res;
    }
}

class Node{
    int data;
    int index;

    Node(int data , int index){
        this.data = data;
        this.index = index;
    }
}

---------------------------------------------------------------------------------------

public class Solution {
    public int[] prevSmaller(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[A.length];

        for(int i = 0 ; i < A.length ; i++){
            while(!stack.isEmpty() && stack.peek()>=A[i]){
                stack.pop();
            }
            if(stack.isEmpty()) res[i] = -1;
            else res[i] = stack.peek();

            stack.push(A[i]);
        }
        return res;
    }
}
