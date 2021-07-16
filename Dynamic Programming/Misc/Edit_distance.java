//gfg

class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int n = s.length();
        int m = t.length();
        
        int[][] dp = new int[n+1][m+1];
        
        //BASE CASE : IF THE LENGTH OF 1 STRING IS 0 THEN
        // MIN NO. OF OPS IS LENGTH OF THE OTHER STRING.
        
        for(int i = 0 ; i < m+1 ; i++) dp[0][i] = i; 
        for(int i = 0 ; i < n+1 ; i++) dp[i][0] = i;
        
        for(int i = 1 ; i< n+1 ; i++){
            for(int j = 1 ; j< m+1 ; j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = 0 + dp[i-1][j-1]; // SAME LAST CHAR -> NO OPS
                }
                else{
                    dp[i][j] = 1 + Math.min(dp[i][j-1],//INSERT
                                            Math.min(dp[i-1][j],//REMOVE
                                            dp[i-1][j-1]));//REPLACE
                }
            }
        }
        
        return dp[n][m];
        
    }
}
