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
      
 
