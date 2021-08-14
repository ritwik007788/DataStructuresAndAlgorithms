class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here 
        
        fill(sr,sc,image.length,image[0].length,image[sr][sc],image,newColor);
        return image;
        
    }
    
    public void fill(int r , int c , int rowLen , int colLen , int oldColor , int[][] image , int newColor){
        if(r>=rowLen || r<0 || c>=colLen || c<0 || image[r][c]!=oldColor){
            return;
        }
        
        if(image[r][c]==newColor) return;//imp edge case 
        image[r][c] = newColor;
        
        fill(r+1,c,rowLen,colLen,oldColor,image,newColor);
        fill(r-1,c,rowLen,colLen,oldColor,image,newColor);
        fill(r,c+1,rowLen,colLen,oldColor,image,newColor);
        fill(r,c-1,rowLen,colLen,oldColor,image,newColor);
        
        return;
    }
}
