//gfg



class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum = 0 ;
        for(int i = 0 ; i < N ; i++){
            sum += arr[i];
        }
        if(sum%2!=0) return 0; // if sum is odd we cannot divide into two equal parts
        int s = sum/2;
        boolean[][] dp = new boolean[N+1][s+1];
        
        boolean ans = partitionCheck(arr,N,s,dp); // we check if half part sum is there in the array or not
        return ans==true?1:0;
        
    }
    
    static boolean partitionCheck(int[] arr , int N , int s , boolean[][] dp){
        for(int i = 0 ; i < s+1 ; i++) dp[0][i] = false;
        for(int i = 0 ; i < N+1 ; i++) dp[i][0] = true;
        
        for(int i = 1 ; i < N+1 ; i++){
            for(int j = 1 ; j < s+1 ; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
        
            }
        }
        return dp[N][s];
    }
}
