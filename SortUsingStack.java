import java.util.Stack;

public class SortUsingStack {

	public static void main(String[] args) {

		Stack<Integer> stack=new Stack<Integer>();
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		
		Stack<Integer> stackTemp=new Stack<Integer>();
		
		while(!stack.isEmpty()){
			int a=stack.pop();
			
			while(!stackTemp.isEmpty() && stackTemp.peek() > a ){
				stack.push(stackTemp.pop());
			}
			stackTemp.push(a);
			
		}
	
		
		
		
		while(!stackTemp.isEmpty()){
			System.out.println(stackTemp.pop());
		}
	}

}
