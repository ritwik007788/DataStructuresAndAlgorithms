public String rev(String s) {
		if(s.length()==1) {
			return s;
		}
		
		return s.charAt(s.length()-1) + rev(s.substring(0, s.length()-1));
		
	}
