// gfg

class Solution
{
    int preIndex = 0 ;
    
    public  Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
        int start = 0 ; // start of inorder
        int end =  n-1; // end of inorder
        Node root = buildTree1(inorder,preorder,start,end);
        return root;
    }
    public  Node buildTree1(int[] inorder,int[] preorder,int inStrt , int inEnd){
        // base condition
        if(inStrt>inEnd) return null;
        
        //creating nodes from Preorder Traversal
        Node tNode = new Node(preorder[preIndex++]);
        
        //Condition of leaf node
        if(inStrt == inEnd) return tNode;
        
        // finding the position of tNode in Inorder array
        int pos = search(inorder,inStrt,inEnd,tNode.data);
        
        //defining left and right subtree
        tNode.left = buildTree1(inorder,preorder,inStrt,pos-1);
        tNode.right = buildTree1(inorder,preorder,pos+1,inEnd);
        
        // returning the root node
        return tNode;
        
    }
    
    //Basic linear search program
    public static int search(int arr[], int strt, int end, int value)
    {
        int i;
        for (i = strt; i <= end; i++) {
            if (arr[i] == value)
                return i;
        }
        return i;
    }
}
