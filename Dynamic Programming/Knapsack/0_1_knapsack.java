// gfg

class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int[][] dp = new int[1001][1001];
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         for(int i = 0 ; i < n+1 ; i++){
             for(int j = 0 ; j < W+1 ; j++){
                 //Initialization
                 if(i==0 || j==0){
                     dp[i][j] = 0 ;
                 }
                 
                //  Note t[i][j] represent a wt array of ith length. This means
                //  that the last element of the array val and wt will be of index i-1.
                 
                 else if(wt[i-1]<=j){ // weight of last element is less than target weight
                     dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]] , dp[i-1][j]);
                 }
                 else{ // weight of last element is more than target weight
                     dp[i][j] = dp[i-1][j];
                 }
             }
         }
         return dp[n][W];
    } 
}
