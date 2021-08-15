//gfg

class main{
    public static void main(String args[]){
        String s1 = "ABCD";
        String s2 = "CDA";
        
        System.out.println(checkRotation(s1,s2));
    }
    
    static boolean checkRotation(String s1 , String s2){
        return(s1.length()==s2.length() && (s1+s1).indexOf(s2)!=-1);
    }
}
