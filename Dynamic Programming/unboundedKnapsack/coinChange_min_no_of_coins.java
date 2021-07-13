//gfg

class Solution{

	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	    int[][] dp = new int[M+1][V+1];
	    

	    
	    for(int i = 0 ; i < V+1 ; i++){
	        dp[0][i] = Integer.MAX_VALUE - 1;
	    }
	    
	    for(int j = 0 ; j < M+1 ; j++){
	        dp[j][0] =  0 ;
	    }	    
	    
	    for(int i = 1 ; i <= M ; i++){
	        for(int j = 1 ; j <=V ; j++){
	            if(coins[i-1]<=j){
	                dp[i][j] = Math.min(dp[i][j-coins[i-1]] + 1 , dp[i-1][j]); // add 1 as we count the minimum no. of coins 
	            }
	            else{
	                dp[i][j] = dp[i-1][j];
	            }
	        }
	    }
	    return dp[M][V]!=Integer.MAX_VALUE-1?dp[M][V]:-1; // return -1 if we get an answer from the 1st row
	} 
}
