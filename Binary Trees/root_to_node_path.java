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
        if(root.val == x) {
            arr.add(x);
            return true;
        }
        arr.add(root.val);
        if(getPath(root.left,arr,x) || getPath(root.right,arr,x)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;
    }

}
