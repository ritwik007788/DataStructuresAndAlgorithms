

    public void inorder(TreeNode root , ArrayList<Integer> list){
        if(root==null) return ;
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;

        while(curr!=null || st.size()>0){
            while(curr!=null){
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();
            list.add(curr.val);
            curr = curr.right;
        }
    }
