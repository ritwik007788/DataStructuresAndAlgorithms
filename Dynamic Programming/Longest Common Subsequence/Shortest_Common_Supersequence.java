//gfg

class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String s1,String s2,int x,int y)
    {
        //Your code here
        
        int common = LCS(s1,s2,x,y);
        
        return (x+y) - common;
    }
    //Generic LCS code
    public static int LCS(String s1 , String s2 , int x , int y){
        int[][] dp = new int[x+1][y+1];
        
        for(int i=0;i<=x;i++)
            dp[i][0] = 0;
        for(int j=0;j<=y;j++)
            dp[0][j] = 0;
        
        
        for(int i=1;i<x+1;i++){
            for(int j=1;j<y+1;j++){
                
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[x][y];
    }
}
