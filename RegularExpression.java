
public class RegularExpression {

	public static void main(String[] args) {
		
//		System.out.println(isMatch("aakb","c*a*b"));
		System.out.println(isAMatch("ba","ba"));
	}

	
	static boolean  isMatch(String s, String p) {
        
		boolean isMatch=false;
		
		if(s.equals(p)){
			
			isMatch=true;
		}else if(p.contains('.'+"")){
			
			for(int i=0;i<p.length() && i<s.length();i++){
				
				if(p.charAt(i) != '.' && s.charAt(i)==p.charAt(i)){
					isMatch=true;
				}else if(p.charAt(i) != '.'){
					isMatch=false;
					break;
				}
				
			}			
		}
		
		
		if(p.contains('*'+"")){
			
			if(p.contains(".*")){
				isMatch=true; 
				String[] ch=p.split(".\\*");
				int lastIndex=0;
				for(int i=0;i<ch.length;i++){
					if(s.contains(ch[i]) &&  s.indexOf(ch[i])>lastIndex)
						{isMatch=true; lastIndex=s.indexOf(ch[i]);}
					else{isMatch=false; break;	}
				}
				
				
			}
			else {
				String[] ch=p.split("\\*");
				int lastIndex=0;
				for(int i=0;i<ch.length;i=i+1){
					
					if(ch[i].length()==1){
						isMatch=true;
					}
					else if(s.substring(lastIndex).contains(ch[i]) && s.substring(lastIndex).indexOf(ch[i])>=lastIndex)
						{isMatch=true;lastIndex=s.substring(lastIndex).indexOf(ch[i]);}
					else{isMatch=false; break;	}
				}

			}
		}
		
		
		
		
		
		
		
		return isMatch;
    }
	
	
	static boolean isAMatch(String s, String p) {
		// base case
		if (p.length() == 0) {
			return s.length() == 0;
		}
	 
		// special case
		if (p.length() == 1) {
	 
			// if the length of s is 0, return false
			if (s.length() < 1) {
				return false;
			}
	 
			//if the first does not match, return false
			else if ((p.charAt(0) != s.charAt(0)) && (p.charAt(0) != '.')) {
				return false;
			}
	 
			// otherwise, compare the rest of the string of s and p.
			else {
				return isMatch(s.substring(1), p.substring(1));
			}
		}
	 
		// case 1: when the second char of p is not '*'
		if (p.charAt(1) != '*') {
			if (s.length() < 1) {
				return false;
			}
			if ((p.charAt(0) != s.charAt(0)) && (p.charAt(0) != '.')) {
				return false;
			} else {
				return isMatch(s.substring(1), p.substring(1));
			}
		}
	 
		// case 2: when the second char of p is '*', complex case.
		else {
			//case 2.1: a char & '*' can stand for 0 element
			if (isMatch(s, p.substring(2))) {
				return true;
			}
	 
			//case 2.2: a char & '*' can stand for 1 or more preceding element, 
			//so try every sub string
			int i = 0;
			while (i<s.length() && (s.charAt(i)==p.charAt(0) || p.charAt(0)=='.')){
				if (isMatch(s.substring(i + 1), p.substring(2))) {
					return true;
				}
				i++;
			}
			return false;
		}
	}	
	
}
