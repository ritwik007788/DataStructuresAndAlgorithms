// gfg

//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        q.add(null);
        while(!q.isEmpty()){
            Node element = q.poll();
            if(element != null){
                list.add(element.data);
                if(element.left!=null) q.add(element.left);
                if(element.right!=null)q.add(element.right);
            }
            else{
                if(!q.isEmpty()) q.add(null);
            }
        }
        return list;
    }
}





