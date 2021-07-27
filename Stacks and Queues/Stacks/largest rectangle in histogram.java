//Leetcode 84
                                                    ---------------
----------------------------------------------------2 pass solution----------------------------------------------------
                                                    ---------------
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int left[] = new int[n];
        int right[] =  new int[n];
        
        Stack<Integer> st = new Stack<>();
        
        //smaller element to the left
        for(int i = 0 ;  i < n ; i++){
            
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            left[i] = st.isEmpty()?0:st.peek()+1;
            st.push(i);
        }
        
        //clearing stack
        
        while(!st.isEmpty()) st.pop();
        
        //smaller element to the right 
        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            right[i] = st.isEmpty()?n-1:st.peek()-1;
            st.push(i);
        }
        
        int maxA = 0;
        
        for(int i = 0 ; i < n ; i++){
            maxA=Math.max(maxA , heights[i]*(right[i]-left[i]+1));
        }
        
        return maxA;
    }
}

                                                    ---------------
----------------------------------------------------1 pass solution----------------------------------------------------
                                                    ---------------
                                                      
public class Solution {
    public int largestRectangleArea(int[] A) {
        int n = A.length;
        Stack<Integer> st = new Stack<>();
        int maxA = 0 ;

        for(int i = 0 ; i <= n ; i++){// <= as we need to deal with the remaining elements of the stack
            while(!st.isEmpty() && (i==n || A[st.peek()]>=A[i])){
                int height = A[st.peek()]; // take the height as the element about to be popped
                st.pop();
                int width = 0;
                if(st.isEmpty()) width = i; // width starting from 0
                else width = i - st.peek() - 1; // window size

                maxA = Math.max(maxA,height*width);
            }
            st.push(i); // always push
        }

        return maxA;
    }
}
      
 
