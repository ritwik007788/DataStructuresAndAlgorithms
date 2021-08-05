//Leetcode 236

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        
        //in first level of recursion it means that if we find the p(or q) then
        //that node with the lowest common node.Hence we return it.
        //In deeper level of recursion it means that if left_lca or right_lca
        //are not null due to this function then there exists p(or q) in left or right subtree. 
        if(root.val == p.val || root.val == q.val){
            return root;
        }
        TreeNode left_lca = lowestCommonAncestor(root.left,p,q);//check for p(or q) in left subtree
        
        TreeNode right_lca = lowestCommonAncestor(root.right,p,q);//check for p(or q) in right subtree
        
        if(left_lca!=null && right_lca!=null){// p and q exist in both the left and right subtree
            return root;
        }
        
        if(right_lca == null) return left_lca;//both p and q exist in left subtree
        return right_lca;//both p and q exist in right subtree
        
    }
}
