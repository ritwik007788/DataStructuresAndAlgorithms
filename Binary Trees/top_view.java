//gfg

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        Queue<Pair> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Node> topViewMap = new TreeMap<Integer,Node>();//TreeMaps maintain keys in ascending order
        
        if (root == null) {
            return list;
        }
        else {
            q.add(new Pair(root, 0));
        }
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            if(!topViewMap.containsKey(curr.hd)){
                topViewMap.put(curr.hd,curr.node);
            }
            
            if(curr.node.left!=null){
                q.add(new Pair(curr.node.left,curr.hd-1));
            }
            
            if(curr.node.right!=null){
                q.add(new Pair(curr.node.right,curr.hd+1));
            }
        }
        
        for (Map.Entry<Integer, Node> entry :
             topViewMap.entrySet()) {
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
