
public class SumOfTwoInt {

	public static void main(String[] args) {

		System.out.println(getSum(12,4));
	}

	
    public static int getSum(int a, int b) {
        while( b != 0){
        	
        	
            int t = a^b;
            
            b = (a&b) << 1;
            
            a = t;
        }

        return a;

    }	
}
