//Leetcode 784

class Solution {
    List<String> list;
    public List<String> letterCasePermutation(String s) {
        list = new ArrayList<String>();
        findPermutations(s,"");
        return list;
    }
    
    public void findPermutations(String ip , String op) {
		if(ip.length()==0) {
			list.add(op);
			return;
		}
        
		char originalChar = ip.charAt(0);
        char caseChangeChar = ip.charAt(0);
        
        if(Character.isLetter(originalChar)){// when we find a letter we change cases
            if(Character.isUpperCase(originalChar)){
                caseChangeChar = Character.toLowerCase(originalChar);
            }
            else{
                caseChangeChar = Character.toUpperCase(originalChar);
            }
            
            String op1 = op + Character.toString(originalChar);
            String op2 = op + Character.toString(caseChangeChar);
            String input = ip.substring(1);

            findPermutations(input,op1);
            findPermutations(input,op2);
        }
        
        else{ // when we find a digit we call the recursive code only once
            String op3 = op + originalChar;
            findPermutations(ip.substring(1),op3);
        }
        
	}
}
