package binaryTree;

public class BinaryTreeTraversals {
	Node root;
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			left=null;
			right=null;
		}
	}
	
	BinaryTreeTraversals(int x){
		root = new Node(x);
	}
    
	BinaryTreeTraversals() {
		root = null;
	}

	public int height(Node root) {
		if(root==null) return 0;
		return Math.max(height(root.left), height(root.right))+1 ;
	}
	
	public void printInOrder(Node node) {
		if(node==null)return;
		
		printInOrder(node.left);
		System.out.print(node.data+" ");
		printInOrder(node.right);
	}
	
	void printPreorder(Node node) {
    	if (node == null) return ;
    	System.out.print(node.data + " ");
    	printPreorder(node.left);
    	printPreorder(node.right);
    }
	
	void printPostorder( Node node) {
	    	
	    	if(node == null) return ;
	    	
	    	printPostorder(node.left);
	    	printPostorder(node.right);
	    	System.out.print(node.data+" ");
	    }
	
	public boolean isBalanced(Node root) {
		if(root==null) return true;

		long diff = Math.abs(height(root.left) - height(root.right));
		
		if(diff<=1 && isBalanced(root.left) && isBalanced(root.right )) {
			return true;
		}
		return false;
	}
    
	public int diameter(Node root) {
		if(root == null) return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		int currHeight = 1 + leftHeight + rightHeight;
		
		int leftSubTree = diameter(root.left);
		int rightSubTree = diameter(root.right);
		
		return Math.max(currHeight, Math.max(leftSubTree, rightSubTree));
	}
    
	
    public static void main(String[] args) {
    	
    	BinaryTreeTraversals bt = new BinaryTreeTraversals();
    	bt.root = new Node(1);
    	bt.root.left = new Node(2);
    	bt.root.right = new Node(3);
    	bt.root.left.left = new Node(4);
    	bt.root.left.right = new Node(5);
    	bt.root.right.left = new Node(6);
    	bt.root.right.right = new Node(7);
    	
    	//System.out.println(bt.height(bt.root));
    	
    	//bt.printInOrder(bt.root);
//    	bt.printPostorder(bt.root);
    	
//    	System.out.println(bt.isBalanced(bt.root));
    	System.out.println(bt.diameter(bt.root));
   
    }
    
    
}
