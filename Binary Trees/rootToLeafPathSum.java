//gfg

/*
// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int S) {
        // Your code here
        boolean ans = false;
        int remaining_sum = S - root.data;
        if(remaining_sum==0 && root.left==null && root.right == null){
            return true;
        }
        if(root.left!=null){
            ans = ans || hasPathSum(root.left,remaining_sum);
        }
        if(root.right!=null){
            ans = ans || hasPathSum(root.right,remaining_sum);
        }
        return ans;
        
    }
}
