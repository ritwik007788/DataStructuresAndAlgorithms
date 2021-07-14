//gfg

// we need to convert str1 to str2.
//To find the minimum no. of insertions and deletions to be made to str1 to do so.

class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    // Your code goes here
	    int x = str1.length();
	    int y = str2.length();
	    
	    int common = LCS(str1,str2,x,y);
	    
	    int insertions = y - common ;// uncommon in str2
	    int deletions = x - common ;// uncommon in str1
	    
	    return insertions+deletions;
	} 
	
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
