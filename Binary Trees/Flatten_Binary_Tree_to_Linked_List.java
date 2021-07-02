//leetcode #114

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return;
        
        if(root.left!=null){
            flatten(root.right);
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = null;
            
            TreeNode left_end = root.right;
            while(left_end.right!=null){
                left_end = left_end.right;
            }
            left_end.right = temp;
        }
        
        flatten(root.right);
        
    }
}
