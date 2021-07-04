// this function returns true/false and if a path exists the path is added to the list
    public boolean hasPath(TreeNode root , int x , ArrayList<Integer> list){ // function to find path from root to x.
        if(root==null)
            return false;

        list.add(root.val);

        if(root.val == x) 
            return true;

        if(hasPath(root.left,x,list) || hasPath(root.right,x,list))  // checking if left and right subtree have node x.
            return true;

        list.remove(list.size()-1); // node x not found hence remove root as it is definitely not there in the path
        return false;
    }
