//InterviewBit (Path to given node)
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> solve(TreeNode root, int x) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(root==null) return arr;

        getPath(root,arr,x);
        return arr;
    }

    // function returns true if path exists and false if not.
    public boolean getPath(TreeNode root , ArrayList<Integer> arr , int x){

        if(root==null) return false;
        
        arr.add(x);
        
        if(root.val == x) {
            return true;
        }
        if(getPath(root.left,arr,x) || getPath(root.right,arr,x)){ // path exists in either left or right subtree
            return true;
        }
        
        arr.remove(arr.size()-1);// path doesn't exist.Hence, we remove this node
        return false;
    }

}
