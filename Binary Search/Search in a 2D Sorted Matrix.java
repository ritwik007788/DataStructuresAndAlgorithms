// Leetcode #74

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //mXn matrix
        int m = matrix.length; // no. of rows //3
        int n = matrix[0].length; // no of columns //4
        
        int i=0; // denotes row
        int j= n-1; // denotes column
        
        while(i>=0&&i<m&&j<n&&j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            else if(matrix[i][j]>target){
                j--; // we go back one column
            }
            else if(matrix[i][j]<target){
                i++; // we go to the next row
            }
        }
        
        return false; // if true is not returned in while loop that means element doesn't exist
    }
}
