package oneMorePractice;

import java.util.Stack;

class MyStack1{
	
	Stack<Integer> s;
	Integer min;
	
	MyStack1(){s=new Stack<Integer>();}
	
	void push(int a){
		
		if(s.isEmpty()){
			s.push(a);
			min=a;
		}else if(a>=min){
			s.push(a);
		}else if(a<min){
			s.push((2*a) - min);
			min=a;
		}		
		
	}
	
	
	int getMin(){
		return min;
	}
	
	int pop(){
		
		int t= s.pop();
		
		if(t>min){}
		else{
			min=((2*min) - t);
		}
		
		return t;
	}
	
	void peek(){
		
		if(s.isEmpty()){
			System.out.println("empty");
			return;
		}
		
		Integer t= s.peek();
		
		if(t<min){
			System.out.println(min);
		}else
			System.out.println(t);
		
	}
}



public class StackWithGetMin {

	public static void main(String[] args) {

		MyStack1 s= new MyStack1();
		s.push(2);
		s.push(8);
		s.push(3);
		s.push(-2);
		s.push(5);
		
		
		System.out.println(s.getMin());
		s.pop();
		s.push(-33);
		s.push(22);
		System.out.println(s.getMin());
		
		s.peek();
		
	}

}
