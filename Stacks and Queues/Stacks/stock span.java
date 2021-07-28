//gfg

class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    
    static class Pair{
        int price;
        int day;
        Pair(int price,int day){
            this.price = price;
            this.day = day;
        }
    }
    public static int[] calculateSpan(int arr[], int n)
    {
        // Your code here
        if(n==1) return new int[]{1};
        
        int[] res = new int[n];
        Stack<Pair> st = new Stack<>();
        
        
        st.push(new Pair(arr[0],1));
        res[0] = 1;
        
        for(int i=1;i<n;i++){
            Pair temp = new Pair(arr[i],1); // curr element
            while(!st.isEmpty() && temp.price>=st.peek().price){
                    temp.day += st.peek().day;
                    st.pop();
            }
            st.push(temp);
            res[i] = temp.day;
        }
        return res;
    }
    
}
