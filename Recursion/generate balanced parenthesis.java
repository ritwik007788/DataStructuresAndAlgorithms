//Leetcode 22

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        solve(n,n,"",list);
        return list;
    }
    
    public void solve(int open , int close , String op , List<String> list){
        if(open == 0 && close == 0){
            list.add(op);
            return;
        }
        
        if(open!=0){
            String op1 = op+"(";
            solve(open - 1  , close , op1 , list );
        }
        
        if(close>open){
            String op2 = op + ")";
            solve(open,close-1,op2,list);
        }
    }
}
