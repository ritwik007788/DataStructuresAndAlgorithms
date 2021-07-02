//gfg

class Solution {
    // Function to return the diameter of a Binary Tree.
    public int diameter(Node root) {
        // Your code here
        if(root==null) return 0 ;
        
        int lheight = height(root.left);
        int rheight = height(root.right);
        int currheight = lheight+rheight+1;
        
        int leftSubTree = diameter(root.left);
        int rightSubTree = diameter(root.right);
        
        return Math.max(currheight,Math.max(leftSubTree,rightSubTree));
    }
    public int height(Node root){
        if (root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
}
