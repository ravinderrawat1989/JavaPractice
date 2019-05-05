import java.math.BigInteger;

public class BigFactorialDP {

	public static void main(String[] args) {

		int a=30;
		BigInteger product=new BigInteger("1");
		for(int i=2;i<a;i++) {

			product = product.multiply(new BigInteger(i+""));
			
		}
		
		System.out.println(product);
	}

}
