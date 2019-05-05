package oneMorePractice;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {

		Stack<Integer> stack1=new Stack<Integer>();
		stack1.push(0);
		stack1.push(1);
		stack1.push(-2);
		stack1.push(4);
		stack1.push(3);
		stack1.push(3);
		stack1.push(6);
		sortStackWithOneMoreStack(stack1);
	}

	
	public static void sortStackWithOneMoreStack(Stack<Integer> stack){
		
		Stack<Integer> stackTemp=new Stack<Integer>();
		int temp=0;
		
		while(!stack.isEmpty()){
			
			temp=stack.pop();
			
			if(stackTemp.isEmpty())
				stackTemp.push(temp);
			else if(temp<=stackTemp.peek()){
				stackTemp.push(temp);
			}
			else if(temp>stackTemp.peek()){
				
				while(!stackTemp.isEmpty() && stackTemp.peek()<temp){
					stack.push(stackTemp.pop());
				}
				
				if(stackTemp.peek()>temp)
					stackTemp.push(temp);
				
			}
			
		}
		
		
		//Now printing 
		while(!stackTemp.isEmpty()){
			stack.push(stackTemp.pop());
		}
		
		System.out.println(stack);
		
	}
	
}
