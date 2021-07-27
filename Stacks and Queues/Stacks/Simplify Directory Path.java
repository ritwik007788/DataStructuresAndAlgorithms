//leetcode 71

// The path starts with a single slash '/'.
// Any two directories are separated by a single slash '/'.
// The path does not end with a trailing '/'.
// The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')



class Solution {
    public String simplifyPath(String path) {
        String arr[] = path.split("/");
        Stack<String> st = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].equals(".") || arr[i].isEmpty()){
                continue;
            }
            else if(arr[i].equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(arr[i]);
            }
        }
        
        StringBuffer sb = new StringBuffer();
        for(String s : st){
            sb.append("/");
            sb.append(s);
        }
        
        return sb.length()>0?sb.toString():"/";
    }
}
