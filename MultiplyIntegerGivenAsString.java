package oneMorePractice;

public class MultiplyIntegerGivenAsString {

	public static void main(String[] args) {

		String a1="12";
		String a2="14";
		
		
		char[] cArray=a1.toCharArray();
		int b1=0;
		int b2=0;
		
		for(char ch:cArray)			
			b1= (b1*10) + ((int)ch - (int)'0');

		
		cArray=a2.toCharArray();
		for(char ch:cArray)			
			b2= (b2*10) + ((int)ch - (int)'0');
		
		
		System.out.println(" Multiplied = " +  b1*b2);
	}

}
