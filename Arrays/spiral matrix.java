//gfg

class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int rowBegin = 0;
        int columnBegin = 0;
        int rowEnd = r-1;
        int columnEnd = c-1;
        ArrayList<Integer> res = new ArrayList<Integer>();
        int dir = 0;
        
        while(rowBegin<=rowEnd && columnBegin<=columnEnd){
            if(dir==0){//left to right
                for(int i = columnBegin ; i <= columnEnd ; i++){
                    res.add(matrix[rowBegin][i]);
                }
                rowBegin++;
            }
            
            else if(dir==1){//top to bottom
                for(int i = rowBegin ; i <= rowEnd ; i++){
                    res.add(matrix[i][columnEnd]);
                }
                columnEnd--;
            }
            else if(dir==2){//right to left
                for(int i = columnEnd ; i >= columnBegin ; i--){
                    res.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            else if(dir==3){//bottom to top
                for(int i = rowEnd ;i >= rowBegin ; i--){
                    res.add(matrix[i][columnBegin]);
                }
                columnBegin++;
            }
            dir=(dir+1)%4;
        }
        return res;
    }
}
