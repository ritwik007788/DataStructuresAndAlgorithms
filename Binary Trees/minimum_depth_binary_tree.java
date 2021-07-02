//gfg


/*
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

class Tree
{
	int minDepth(Node root)
	{
	    if(root==null){
	        return 0;
	    }
	    
	    int left = minDepth(root.left);
	    int right = minDepth(root.right);
	    if(left==0)return 1+right;// avoiding no left child case
	    if (right==0 )return 1+left;// avoiding no right child case
	    return 1+Math.min(left,right);
	}
}
