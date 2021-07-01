//gfg

class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> list = new ArrayList<>();
      
      //Base condition 
        if(node==null) return list;
        
        //We code this problem similar to level order tarversal except the NULL part
        Queue<Node> q = new LinkedList<>();
        
        q.add(node);
        
        while(!q.isEmpty()){
            int n = q.size();//length of a level
            for(int i = 0 ; i< n ; i++){ // traverse the level
                Node curr = q.poll();
                if(i==n-1) list.add(curr.data);//last element of level
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
        }
        return list;
    }
}

