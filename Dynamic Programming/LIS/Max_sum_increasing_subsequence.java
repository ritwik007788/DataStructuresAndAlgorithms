//gfg

class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    int[] dp = new int[n];
	    dp[0] = arr[0];
	    for(int i = 1 ;  i < n ; i++){
	        dp[i] = arr[i];
	        for(int j = 0 ; j < i ;j++){
	            if(arr[j]<arr[i] && dp[i]<arr[i]+dp[j]){
	                dp[i] = arr[i] + dp[j] ;
	            }
	        }
	    }
	    
	    return max(dp);
	    
	}
	public int max(int[] dp){
	   int max = Integer.MIN_VALUE;
	   for(int i = 0 ; i < dp.length ; i++){
	       max = Math.max(max,dp[i]);
	   }
	   return max;
	}
	
}
