//Leetcode 100

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        
        if(p.val==q.val)//if p and q have same value we check further
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        
        return false;
    }
}
