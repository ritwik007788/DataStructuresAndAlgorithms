//leetcode 885

class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        ArrayList<int[]> res= new ArrayList<>();
        int[][] dirt = {{0,1},{1,0},{0,-1},{-1,0}};// east, south, west, north
        int len = 0 ;
        int dir = 0;// move <len> steps in the <d> direction
        res.add(new int[]{rStart,cStart});
        while(res.size()<rows*cols){
            // Examining the lengths of our walk in each direction, we find the following pattern: 1, 1, 2, 2, 3, 3, 4, 4, ... That is, we walk 1 unit east, then 1 unit south, then 2 units west, then 2 units north, then 3 units east, etc. Because our walk is self-similar, this pattern repeats in the way we expect.
            
            
            if(dir==0 || dir==2) len++;// when move east or west, the length of path need plus 1
            
            for(int i = 0 ; i < len ; i++){
                rStart += dirt[dir][0];
                cStart += dirt[dir][1];
                
                // check valid
                if(rStart<rows && rStart>=0 && cStart<cols && cStart>=0){
                    res.add(new int[]{rStart,cStart});
                }
            }
            
            dir=(dir+1)%4;// turn to next direction
        }
        return res.toArray(new int[rows*cols][2]);
    }
}
