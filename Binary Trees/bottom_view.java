//gfg

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Node> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        
        if(root==null) return list;
        else q.add(new Pair(root,0));
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            
            map.put(curr.hd,curr.node);
            if(curr.node.left!=null)q.add(new Pair(curr.node.left,curr.hd-1));
            if(curr.node.right!=null)q.add(new Pair(curr.node.right,curr.hd+1));
            
        }
        
        for (Map.Entry<Integer, Node> entry :
             map.entrySet()) {
            list.add(entry.getValue().data);
        }
        
        return list;
        
    }
}

class Pair{
    Node node;
    int hd;
    
    Pair(Node node , int hd){
        this.node = node;
        this.hd = hd;
    }
}
