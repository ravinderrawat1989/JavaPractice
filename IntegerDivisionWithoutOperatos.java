
public class IntegerDivisionWithoutOperatos {

	public static void main(String[] args) {
		
		int a=16;
		int b=3;
		
		if(a<b) System.out.println(0);
		
		int count=0;
		
		for(int i=b;i<=a;i=i+b)
			{ 
					count++;
			}
			
		System.out.println(count);	
		
	}

}
