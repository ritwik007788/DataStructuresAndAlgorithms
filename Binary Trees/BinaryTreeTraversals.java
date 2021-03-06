package binaryTree;

public class BinaryTreeTraversals {
	Node root;
	 
    BinaryTreeTraversals() { root = null; }
    
    void printPostorder( Node node) {
    	
    	if(node == null) return ;
    	
    	printPostorder(node.left);
    	printPostorder(node.right);
    	System.out.print(node.key+" ");
    }
    
    void printPreorder(Node node) {
    	if (node == null) return ;
    	System.out.print(node.key + " ");
    	printPreorder(node.left);
    	printPreorder(node.right);
    }
    
    void printInorder(Node node)
    {
        if (node == null) return;
        
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }
    
    // wrapper functions
    void printPostorder() { printPostorder(root); }
    void printInorder() { printInorder(root); }
    void printPreorder() { printPreorder(root); }
    
    public static void main(String[] args) {
    	BinaryTreeTraversals tree = new BinaryTreeTraversals();
    	tree.root = new Node(1);
    	tree.root.left = new Node(2);
    	tree.root.right = new Node(3);
    	tree.root.left.left = new Node(4);
    	tree.root.left.right = new Node(5);
    	
    	tree.printInorder();
    	System.out.println("");
    	tree.printPostorder();
    	System.out.println("");
    	tree.printPreorder();
    }
    
    
}

class Node{
	int key ;
	Node left , right;
	
	public Node(int key) {
		this.key = key;
		this.left = null;
		this.right=null;
	}
}