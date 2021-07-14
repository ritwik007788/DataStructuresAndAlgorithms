//gfg

class Solution{
    
    static int minimumNumberOfDeletions(String s1)
    {
        //your code here
        //Generic LPS code
        String s2 = reverse(s1);
        int n= s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];
        
        for(int i=0;i<=n;i++){
            dp[i][0] = 0;
        }
        
        for(int j=0;j<=m;j++){
            dp[0][j] = 0;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return n - dp[n][m];
    }
    
    static String reverse(String s){
        String res ="";
        
        for(int i=s.length()-1;i>=0;i--){
            res += s.charAt(i);
        }
        
        return res;
    }
}
