//gfg

class Solution {
    ArrayList<String> NBitBinary(int N) {
        // code here
        ArrayList<String> list = new ArrayList<>();
        solve(0,0,N,list,"");
        return list;
    }
    
    void solve(int ones, int zeroes , int n , ArrayList<String> list , String op){
        if(n==0){
            list.add(op);
            return;
        }
        
        String op1 = op + "1";
        solve(ones+1,zeroes,n-1,list,op1);
        
        
        if(ones>zeroes){
            solve(ones,zeroes+1,n-1,list,op+"0");
        }
        
    }
}
