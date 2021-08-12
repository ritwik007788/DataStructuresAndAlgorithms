//gfg editorial

Print all permutations of a string keeping the sequence but changing cases.
Examples: 
 
Input : ab
Output : AB Ab ab aB

public class roughwork {

	
	static ArrayList<String> list;
	public static void main(String[] args) {
		list = new ArrayList<String>();
		String ip = "ab";
		String op = "";
		
		findPermutations(ip,op);
		System.out.println(list);
	}
	
	static void findPermutations(String ip , String op) {
		if(ip.length()==0) {
			list.add(op);
			return;
		}
		char c = ip.charAt(0);
		String op1 =op + Character.toString(c);
		String op2 =op + Character.toString(Character.toUpperCase(c));
		String input = ip.substring(1);
		
		findPermutations(input,op1);
		findPermutations(input,op2);
	}
}


OP : [ab, aB, Ab, AB]
