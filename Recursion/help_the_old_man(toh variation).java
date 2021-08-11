//gfg

class Solution{
    static int count = 0 ;
    static List<Integer> shiftPile(int N, int n){
        // code here
        List<Integer> ans = new ArrayList<Integer>();
        toh(N,n,1,3,2,ans);
        return ans;
    }
    
    static void toh(int n , int m , int source , int dest , int helper , List<Integer> ans){
        if(n==1){
            count++;
            return;
        }
        toh(n-1,m,source,helper,dest,ans);
        count++;
        if(count==m){
            ans.add(source);
            ans.add(dest);
        }
        toh(n-1,m,helper,dest,source,ans);
    }
    
}
