//leetcode545

Left Boundary excluding leaves + Leaves(left to right) + right Boundary in reverse order

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
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        if(isLeaf(root)){
            list.add(root.val);
            return list;
        }
        list.add(root.val);
        leftBoundary(root,list);
        addLeaves(root,list);
        rightBoundary(root,list);
        return list;
        
    }
    
    //iterative function
    public void leftBoundary(TreeNode root , List<Integer> list){
        TreeNode curr = root.left;
        
        while(curr!=null){
            
            if(!isLeaf(curr)) list.add(curr.val);
            
            if(curr.left!=null) curr = curr.left;
            else curr = curr.right;
        }
    }
    
    //recursive preorder traversal
    public void addLeaves(TreeNode root , List<Integer> list){
        if(isLeaf(root)){
            list.add(root.val);
            return;
        }
        if(root.left!=null) addLeaves(root.left,list);
        if(root.right!=null) addLeaves(root.right,list);
    }
    
    //iterative right
    public void rightBoundary(TreeNode root , List<Integer> list){
        TreeNode curr = root.right;
        Stack<Integer> st = new Stack();
        while(curr!=null){
            
            if(!isLeaf(curr)) st.push(curr.val);
            
            if(curr.right!=null) curr = curr.right;
            else curr = curr.left;
        }
        
        while(!st.isEmpty()){
            list.add(st.pop());
        }
    }
    
    public boolean isLeaf(TreeNode root){
        if(root.left==null && root.right==null) return true;
        return false;
    }
    
    
    
}
