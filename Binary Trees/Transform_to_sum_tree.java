//gfg

/*Complete the Given Function

Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
    	data=d;
    	left=null;
    	right=null;
    }
}*/

class Solution{
    public void toSumTree(Node root){
         //add code here.
         if(root==null) return ;
         if(root.left==null && root.right ==null) root.data = 0 ;
         
         
         int a = root.left!=null?root.left.data:0;
         int b = root.right!=null?root.right.data:0;
         root.data = a+b;
         toSumTree(root.left);
         toSumTree(root.right);
         root.data += (root.left!=null?root.left.data:0) + (root.right!=null?root.right.data:0);

         
    }
}
