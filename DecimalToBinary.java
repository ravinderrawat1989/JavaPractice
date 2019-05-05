import java.util.Stack;

public class DecimalToBinary {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		
		
		int num = 89;
		
		
		while(num >0) {
			
			stack.push(num % 2);
			num=num/2;			
		}
		
		while(!stack.isEmpty())
			System.out.print(stack.pop());
		
	}

}
