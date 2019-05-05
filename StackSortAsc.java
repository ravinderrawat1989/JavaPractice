import java.util.Stack;

public class StackSortAsc {

	public static void main(String[] args) {

		Stack<Integer> stack= new Stack<Integer>();
		
		stack.push(2);
		stack.push(1);
		stack.push(7);
		stack.push(-1);
		stack.push(3);
		stack.push(5);
		stack.push(99);
		stack.push(6);
		stack.push(4);
		stack.push(8);
		
		while(!stack.isEmpty())
			System.out.print( stack.pop()+ "  ");
		
		
		stack.push(2);
		stack.push(1);
		stack.push(7);
		stack.push(-1);
		stack.push(3);
		stack.push(5);
		stack.push(99);
		stack.push(6);
		stack.push(4);
		stack.push(8);
		
		System.out.println();
		
		sortStackAsc(stack);
		
		while(!stack.isEmpty())
			System.out.print( stack.pop()+ "  ");
		
		
	}

	public static void sortStackAsc(Stack<Integer> stack){
	
		Stack<Integer> temp =new Stack<Integer>();
		
						
		
		while(!stack.isEmpty()){
			
			int min=stack.pop();
		
			while(!temp.isEmpty() && temp.peek() < min ){
				stack.push(temp.pop());
			}
			temp.push(min);
		}		
		
		while(!temp.isEmpty())
			stack.push(temp.pop());
		
	}
	
}
