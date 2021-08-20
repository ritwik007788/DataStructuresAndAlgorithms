//gfg

class GfG
{
	boolean isCompleteBT(Node root)
    {
          if(root==null) return true;
          int n = countNodes(root);
          
          return solve(root,0,n);
	}
	int countNodes(Node root){
	    if(root==null) return 0;
	    return 1+countNodes(root.left)+countNodes(root.right);
	}
	
	boolean solve(Node root , int index , int countNodes){
	    if(root==null) return true;
	    
	    if(index>=countNodes) return false;
	    
	    return (solve(root.left , 2*index+1 , countNodes) && 
	    solve(root.right , 2*index+2 , countNodes));
	}
}
