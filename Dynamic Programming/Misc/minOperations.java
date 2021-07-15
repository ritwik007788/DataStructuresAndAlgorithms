//gfg

class Solution
{
    public int minOperation(int n)
    {
        //code here.
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        if(n==0) return 0;
        dp[0] = 0;
        dp[1] = 1;
        
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
