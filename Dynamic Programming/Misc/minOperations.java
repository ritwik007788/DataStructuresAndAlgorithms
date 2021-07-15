//gfg

class Solution
{
    public int minOperation(int n)
    {
        //code here.
        int dp[] = new int[n+1];
       
        dp[0] = 0;
 
        for(int i = 2 ; i< n+1 ; i++){
            if(i%2==0){
                dp[i] = Math.min(1+dp[i-1],1+dp[i/2]);
            }
            else{
                dp[i] = 1+dp[i-1];
            }
        }
        return dp[n];
    }
}
