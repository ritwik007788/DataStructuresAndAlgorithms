//gfg

class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
        String rev = rev(S);
        int length = lcs(S.length(),rev.length(),S,rev);
        return length;
        
    }
    public String rev(String S){
        int n = S.length();
        StringBuffer sb = new StringBuffer();
        for(int i = n-1;i>=0;i--){
            sb.append(S.charAt(i));
        }
        return sb.toString();
    }
    
    public int lcs(int x, int y, String s1, String s2)
    {
        int dp[][] = new int[x+1][y+1];
        
        for(int i = 0 ; i < x+1 ; i++){
            dp[i][0] = 0;
        }
        
        for(int i = 0 ; i < y+1 ; i++){
            dp[0][i] = 0;
        }
        
        for(int i = 1 ; i < x+1 ; i++){
            for(int j = 1 ; j < y+1 ; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1]; 
                }
                else{
                    dp[i][j] =  Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        
        return dp[x][y];
    }
}
