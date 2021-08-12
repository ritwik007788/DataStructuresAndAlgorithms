//gfg


class Solution{
    ArrayList<String> list;
    ArrayList<String> permutation(String S){
        // Code Here
        list = new ArrayList<String>();
        String op = Character.toString(S.charAt(0));
        String ip = S.substring(1);
        findPermutations(op,ip);
        return list;
        
    }
    
    void findPermutations(String op , String ip){
        
        if(ip.length()==0){
            list.add(op);
            return;
        }
        
        String op1 = op + " ";
        op1+=ip.charAt(0);
        
        String op2 = op + ip.charAt(0);
        
        String input = ip.substring(1);
        
        findPermutations(op1,input);
        findPermutations(op2,input);
    }
    
}
