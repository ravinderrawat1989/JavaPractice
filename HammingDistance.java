
public class HammingDistance {

	public static void main(String[] args) {

		System.out.println(hammingDistance(1,4));
		
		
		
		
	}

	  static  int hammingDistance(int x, int y) {
	   
		
		String a1=Integer.toBinaryString(x);
		String a2=Integer.toBinaryString(y);
		String shorter=null;
		

		int diff=Math.abs(a1.length()-a2.length());
		
		if(a1.length()<a2.length())
			{
			
			for(int i=0;i<diff;i++)
				a1="0"+a1;

			}
		
		else{
			for(int i=0;i<diff;i++)
				a2="0"+a2;

			}
			
			
			
		
		
		
		
		
		int counter=0;
		for(int i=a1.length()-1;i>=0;i--){
			
			if( a1.toCharArray()[i] != (a2.toCharArray()[i]))
				counter++;
		}
		
		return counter;
	  }
}
