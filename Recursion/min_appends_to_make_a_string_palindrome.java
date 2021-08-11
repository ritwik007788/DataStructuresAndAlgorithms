public class roughwork {

	public static void main(String[] args) {
		
		String s = "abcec";
		int res = minAppends(s);
		System.out.println(res);
	}
	
	static int minAppends(String s) {// minimum elements to be appended to make a string palindrome
		
		if(isPalindrome(s.toCharArray())) {
			return 0;
		}
		
		String str = s.substring(1);// remove the 0th index element
				
		return 1 + minAppends(str);
	}
	
	static boolean isPalindrome(char[] str) {
		int len = str.length;
		   
	    // single character is always palindrome
	    if (len == 1)
	        return true;
	   
	    // pointing to first character
	    int ptr1 = 0;
	     
	    // pointing to last character
	    int  ptr2 = len-1;
	   
	    while (ptr2 >= ptr1)
	    {
	        if (str[ptr1] != str[ptr2])
	            return false;
	        ptr1++;
	        ptr2--;
	    }
	   
	    return true;
	}

}
