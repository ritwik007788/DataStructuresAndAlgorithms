// gfg 

// to find the minimum subset sum difference 

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    int sum = 0;
	    for(int i = 0 ; i < n ; i++){
	        sum += arr[i];
	    }
	    
	    int s1 = subset(arr,sum);
	    return (sum - 2*s1);
	    
	} 
	
	public int subset(int[] arr ,int sum){
	    int n = arr.length;
	    boolean[][] dp = new boolean[n+1][sum+1];
	    for(int i=0 ; i < sum+1 ; i++){
	        dp[0][i] = false;
	    }
	    for(int i=0 ; i < n+1 ; i++ ){
	        dp[i][0] = true;
	    }
	    
	    for(int i = 1 ; i <= n ; i++){
	        for(int j = 1 ; j <= sum ; j++){
	            if(arr[i-1]<=j){
	                dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
	            }
	            else{
	                dp[i][j] = dp[i-1][j];
	            }
	        }
	    }
	    
	    for(int i = sum/2 ; i>=0 ; i--){
	        if(dp[n][i]==true){
	            return i;
	        }
	    }
	    return 0;
	}
}
