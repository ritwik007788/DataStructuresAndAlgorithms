

import java.io.*;

class GFG {
	public static void main (String[] args) {
		String x = "acbcf";
		String y = "abcdaf";
		
		int n = x.length();
		int m = y.length();
		
		int[][] dp = LCS(x,y,n,m);
		
		String res = LCSprint(dp,n,m,x,y);
		System.out.println(res);
		
		
	}
	
	public static String LCSprint(int[][] dp ,int n ,int m , String x , String y){
	    StringBuilder sb = new StringBuilder();
	    int i = n;
	    int j = m;
	    while(i>=0 && j>=0){
	        if(x.charAt(i-1) == y.charAt(j-1)){
	            sb.append(x.charAt(i-1));
	            i--;
	            j--;
	        }
	        else{
	            if(dp[i-1][j]>dp[i][j-1]){
	                i--;
	            }
	            else{
	                j--;
	            }
	        }
	    }
	    return sb.toString();
	}
	public static int[][] LCS(String x , String y , int n , int m){
	    int[][] dp = new int[n+1][m+1];
	    
	    for(int i = 0 ; i <= n ; i++){
	        for (int j = 0 ; j <= m ; j++){
	            if(i==0 || j==0){
	                dp[i][j] = 0;
	            }
	            
	            else if(x.charAt(i-1) == y.charAt(j-1)){
	                dp[i][j] = 1 + dp[i-1][j-1];
	            }
	            else{
	                dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
	            }
	        }
	    }
	    return dp;
	    
	}
}
