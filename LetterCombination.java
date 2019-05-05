
public class LetterCombination {

	public static void main(String[] args) {

		char[] two={'a','b','c'};
		char[] three={'d','e','f'};
		char[] four={'g','h','i'};
		
		
		int a=2;
		int b=3;
		
		char[] first=null;
		char[] second=null;
		
		if(a == 2)
			first=two;
		
		if(b==3)
			second=three;
		
		
		System.out.print("[");
		
		for(int i=0;i<first.length;i++){
			
			for(int j=0;j<second.length;j++){
				
				
				System.out.print((char)first[i] +""+ (char)second[j] + " , ");
				
			}						
			
		}
		
		System.out.print("]");
	}

}
