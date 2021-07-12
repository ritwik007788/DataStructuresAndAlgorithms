// leetcode

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        // s1 - s2 = target
        // s1 + s2 = sum
        // s1 = (diff + sum)/2
        
        int sum = 0 ;
        for(int i = 0 ; i< nums.length ; i++){
            sum += nums[i];
        }
        
        if((sum+target)%2 != 0){
            return 0;
        }
      
        int s1 = (target+sum)/2;
        
        return countSubsets(nums,nums.length,s1);
    }
    
    public int countSubsets(int[] arr ,int N, int sum){
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
