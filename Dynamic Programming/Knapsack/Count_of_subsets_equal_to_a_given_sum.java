//gfg

class GFG {
    
	public static void main (String[] args) {
		int arr[] = {2,3,5,6,8,10};
		int sum = 10;
		int N = arr.length;
		
		
		int ans = countSubsets(arr,N,sum);
		System.out.println(ans);
	}
	
	static int countSubsets(int[] arr , int N ,int sum){
	    int[][] dp = new int[N+1][sum+1];
	    
	    for(int i = 0 ; i < sum+1 ; i++) dp[0][i] = 0;
	    for(int i = 0 ; i < N+1 ; i++) dp[i][0] = 1;
	    
	    for(int i = 1 ; i < N+1 ; i++){
	        for(int j = 1 ; j < sum+1 ; j++){
	            
	            if(arr[i-1]>j){
	                dp[i][j] = dp[i-1][j];
	            }
	            else{
	                dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]] ;
	            }
	            
	        }
	    }
	    return dp[N][sum];
	}
}
