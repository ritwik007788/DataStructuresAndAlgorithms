//Leetcode 994

class Solution {
    
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        Queue<Node> q = new LinkedList<>();
        
        // add all bad oramges to the queue
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                if(grid[i][j]==2){
                    q.add(new Node(i,j));
                }
            }
        }
        // add a delim to indicate the end of 1st minute
        q.add(new Node(-1,-1));
        int ans = 0;
        
        
        while(!q.isEmpty()){
            
            boolean flag = false;
            
            while(!isDelim(q.peek())){
                Node temp = q.peek();
                
                // for temp we check all the 4 directions for spreading rotteness(if thats a word)
                
                if(isValid(temp.x+1,temp.y,r,c) && grid[temp.x+1][temp.y]==1){
                    
                    if(!flag){
                        ans++;
                        flag = true;
                    }
                    
                    grid[temp.x+1][temp.y] = 2;
                    q.add(new Node(temp.x+1,temp.y));
                }
                
                if(isValid(temp.x,temp.y+1,r,c) && grid[temp.x][temp.y+1]==1){
                    
                    if(!flag){
                        ans++;
                        flag = true;
                    }
                    
                    grid[temp.x][temp.y+1] = 2;
                    q.add(new Node(temp.x,temp.y+1));
                }
                
                if(isValid(temp.x-1,temp.y,r,c) && grid[temp.x-1][temp.y]==1){
                    
                    if(!flag){
                        ans++;
                        flag = true;
                    }
                    
                    grid[temp.x-1][temp.y] = 2;
                    q.add(new Node(temp.x-1,temp.y));
                }
                
                if(isValid(temp.x,temp.y-1,r,c) && grid[temp.x][temp.y-1]==1){
                    
                    if(!flag){
                        ans++;
                        flag = true;
                    }
                    
                    grid[temp.x][temp.y-1] = 2;
                    q.add(new Node(temp.x,temp.y-1));
                }
                
                q.remove();
            }
            
            q.remove(); // removing delim
            
            if(!q.isEmpty()) q.add(new Node(-1,-1)); 
            
        }
        
        return checkAll(grid)?-1:ans;
        
    }
    
    boolean isValid(int i, int j , int r , int c)
    {
        return (i >= 0 && j >= 0 && i < r && j < c);
    }
    
    boolean isDelim(Node temp)
    {
        return (temp.x == -1 && temp.y == -1);
    }
    
    // Function to check whether there is still a fresh
    // orange remaining
    boolean checkAll(int arr[][])
    {
         for (int i=0; i<arr.length; i++)
               for (int j=0; j<arr[0].length; j++)
                  if (arr[i][j] == 1)
                     return true;
         return false;
    }
}

class Node{
    int x;// contains the x-coordinate 
    int y;// contains the y-coordinate
    
    Node(int x , int y){
        this.x = x;
        this.y = y;
    }
}
