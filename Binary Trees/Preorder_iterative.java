// traversal order gets stored in list

    public void preorder(TreeNode root,ArrayList<Integer> list){
        if (root == null) return ;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);

        while(st.size()>0){
            TreeNode curr = st.pop();
            list.add(curr.val);

            if(curr.right!=null) st.push(curr.right);
            if(curr.left!=null) st.push(curr.left);
        }
