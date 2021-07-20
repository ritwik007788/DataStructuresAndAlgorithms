//leetcode 73

class Solution {
    public void setZeroes(int[][] matrix) {
        
        // variables to check first row and first column
        boolean firstCol = false;
        boolean firstRow = false;
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // if we find 0 in 1st col we update variable
        for(int i = 0 ; i < rows ; i++){
            if(matrix[i][0]==0){
                firstCol = true;
                break;
            }
        }
        
        // if we find 0 in first row we update variable
        for(int j = 0 ; j < cols ; j++){
            if(matrix[0][j]==0){
                firstRow = true;
                break;
            }
        }
        
        // traverse through matrix(other than 1st rows and col) and when we find an element
        // to be zero update its first row and column value to 0 as an indicator
        for(int i = 1 ; i < rows ; i++){
            for(int j = 1 ; j < cols ; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        // if first row and col value is zero then make element 0
        for(int i = 1 ; i < rows ; i++){
            for(int j = 1 ; j < cols ; j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] = 0 ;
                }
            }
        }
        
        // finally fill the first row and column
        
        if(firstRow){
            for(int i = 0 ; i < cols ; i++){
                matrix[0][i] = 0;
            }
        }
        if(firstCol){
            for(int i = 0 ; i < rows ; i++){
                matrix[i][0] = 0;
            }
        }
        
        
    }
}
