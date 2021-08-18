//gfg

class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st = new Stack();
        
        for(char c : S.toCharArray()){
            if(isOperator(c)){
                int a = st.pop();
                int b = st.pop();
                int newVal = evaluate(a ,  b ,  c);
                st.push(newVal);
            }
            else
                st.push(Integer.parseInt(String.valueOf(c)));
        }
        
        return st.peek();
        
    }
    
    public static boolean isOperator(char c){
        if(c=='*' || c=='/' || c=='+' || c=='-'){
            return true;
        }
        return false;
    }
    public static int evaluate(int a , int b , char c){
        if(c=='*'){
            return b * a;
        }
        if(c=='/'){
            return b / a;
        }
        if (c=='-'){
            return b - a;
        }
        
        return b + a;
    }
}
