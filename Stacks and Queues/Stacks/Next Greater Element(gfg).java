//gfg


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long res[] = new long[n];
        Stack<Node> st = new Stack();
        
        st.push(new Node(arr[0],0));
        for(int i = 1 ; i < n ; i++){
            if(st.peek().data < arr[i]){
                while(!st.isEmpty() && st.peek().data < arr[i]){
                    res[st.peek().index] = arr[i];
                    st.pop();
                }
            }
            st.push(new Node(arr[i],i));
        }
        
        for(int i = 0 ; i < n ; i++){
            if(res[i]==0){
                res[i] = -1;
            }
        }
        return res;
    }
    
}

class Node{
    long data;
    int index;
    
    Node(long data , int index){
        this.data = data;
        this.index = index;
    }
}
