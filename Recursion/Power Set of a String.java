//gfg

class LexSort
{
    //Function to return the lexicographically sorted power-set of the string.
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        ArrayList<String> list = new ArrayList<>();
        String op ="";
        findPermutations(s,op,list);
        return list;
        
    }
    
    static void findPermutations(String ip , String op , ArrayList<String> list){
        if(ip.length()==0){
            list.add(op);
            return;
        }
        
        String op1 = op;
        String op2 = op;
        op2+=ip.charAt(0);
        
        String input = ip.substring(1);
        
        findPermutations(input,op1,list);
        findPermutations(input,op2,list);
        
        
    }
}
