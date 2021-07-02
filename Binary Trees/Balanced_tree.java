//gfg

//Balanced tree : for all nodes the absolute difference of the left subtree and the right subtree must be <= 1.

class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    public boolean isBalanced(Node root)
    {
	// Your code here
	if(root==null) return true;
	
	int diff = Math.abs(height(root.left)-height(root.right));
	if(diff<=1 && isBalanced(root.left) && isBalanced(root.right)) return true;
	return false;
    }
    
    public int height(Node root){
        if(root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
}
