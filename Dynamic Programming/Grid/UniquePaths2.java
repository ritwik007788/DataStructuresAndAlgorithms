//Leetcode 63

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        
        int dp[][] = new int[rows][cols];
        
        //initialization
        
        if(obstacleGrid[0][0] == 1){
            return 0;
        }
        dp[0][0] = 1;
        
        for(int i = 1 ; i < cols ; i++){
            if(obstacleGrid[0][i] == 1) 
                dp[0][i] = 0;
            else
                dp[0][i] = dp[0][i-1];
        }
        
        for(int i = 1 ; i < rows ; i++){
            if(obstacleGrid[i][0] == 1) 
                dp[i][0] = 0;
            else
                dp[i][0] = dp[i-1][0];
        }
        
        // Now for general cases solve like unique paths 1
        // only diff. is if we encounter an obstacle then fill 0 in dp[][]
        
        for(int i = 1 ; i < rows ; i++){
            for(int j = 1 ; j < cols ; j++){
                if(obstacleGrid[i][j] == 0){ // no obstacle found
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
                else{//obstacle found
                    dp[i][j] = 0;
                }
            }
        }
        
        return dp[rows-1][cols-1];
        
    }
}
