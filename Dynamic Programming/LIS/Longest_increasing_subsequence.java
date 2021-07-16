//gfg

class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int n, int arr[])
    {
        // code here
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1 ; i < n ; i++){
            dp[i] = 1 ;
            for(int j = 0 ; j < i ; j++){
                if(arr[i]>arr[j] && dp[i]<1+dp[j]){
                    dp[i] = 1 + dp[j];
                }
            }
        }
        return max(dp);
        
    }
    
    static int max(int[] arr){
        int max = 0;
        for(int i =0 ; i<arr.length;i++){
            if(max<arr[i]) max = arr[i];
        }
        return max;
    }
} 
