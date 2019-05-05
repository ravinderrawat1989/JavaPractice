import java.util.Stack;

public class MyQueueUsingStacks {

	Stack<Integer> stackNewest,stackOldest;
	
	MyQueueUsingStacks(){
		stackNewest=new Stack<Integer>();
		stackOldest=new Stack<Integer>();
	}
	
	
	public static void main(String[] args) {

		
		MyQueueUsingStacks m=new MyQueueUsingStacks();
		m.add(1);
		m.add(2);
		m.add(3);
		m.add(4);
		System.out.println(m.peek());
		System.out.println(m.peek());
		
		
	}
	
	public int size(){
		return stackNewest.size() + stackOldest.size();
	}
	
	
	public void add(int x){
		stackNewest.push(x);
	}
	
	public void shiftStacks(){
		
		if(stackOldest.isEmpty()){
			while(!stackNewest.isEmpty())
				stackOldest.push(stackNewest.pop());
		}
	}
	
	public int remove(){
		shiftStacks();
		return stackOldest.pop();
		
	}
	
	public int peek(){
		shiftStacks();
		return stackOldest.peek();
		
	}
	
	

}
