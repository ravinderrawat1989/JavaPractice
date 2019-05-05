
public class SquareRoot {

	public static void main(String[] args) {

		System.out.println(sqrt(7));
	}

	static  int sqrt(int x){
		int sqrt=111111;
		
		for(int i=1;i<=x/2;i++){
			
			if( i*i < x )
				continue;
			
			if( i*i==x){
				sqrt=i;
				break;
			}
				
				
		}
		
		return sqrt;
	}
}
