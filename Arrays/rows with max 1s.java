//gfg

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int i = 0;
        int j = m-1;
        //we check from top right
        int row = -1;
        while(i<n && j>=0){
            if(arr[i][j]==1){
                row = i;
                j--;
            }
            else{
                i++;
            }
            
        }
        
        return row;
        
    }
}
