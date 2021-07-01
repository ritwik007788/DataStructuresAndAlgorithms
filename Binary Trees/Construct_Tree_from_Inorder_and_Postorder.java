// gfg

/* Tree node structure
class Node
{
    int data;
    Node left;
    Node right;

        Node(int value)
    {
        data = value;
        left = null;
        right = null;
    }
}*/


class GfG
{
    int postidx = 0;
    //Function to return a tree created from postorder and inoreder traversals.
    public Node buildTree(int in[], int post[], int n) {
        postidx = n-1 ;
        Node root = buildTree1(in,post,0,n-1);
        return root;
    }
    public Node buildTree1(int[] in , int[] post , int start , int end){
        if(start>end) return null;
        
        Node tNode = new Node(post[postidx--]);
        
        if(start==end) return tNode;
        
        int pos = search(in,start,end,tNode.data);
        
        tNode.right = buildTree1(in,post,pos+1,end);
        tNode.left = buildTree1(in,post,start,pos-1);
        
        return tNode;
        
    }
    public int search(int arr[], int strt, int end, int value)
    {
        int i;
        for (i = strt; i <= end; i++) {
            if (arr[i] == value)
                return i;
        }
        return i;
    }
}
