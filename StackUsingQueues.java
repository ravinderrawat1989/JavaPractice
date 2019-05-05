package oneMorePractice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class MyStackUsingQueue{
	
	Queue<Integer> q1=new LinkedList<>();
	Queue<Integer> q2=new LinkedList<>();
	int elementCount=0;
	
	void push(int a){
		q1.add(a);
		elementCount++;
	}
	
	int pop(){
		int toReturn=0;
		Queue<Integer> temp=null;
		
		for(int i=1;i<elementCount;i++){			
			q2.offer(q1.poll());						
		}
		
		toReturn=q1.poll();
		
		elementCount--;
		
		//SWAP q1 q1;
		
		temp=q2;
		q2=q1;
		q1=temp;
		
		return toReturn;
	}
	
	
	void printStack(){
		
		while(!q1.isEmpty()){
			System.out.print("["+ q1.poll() +"]");
		}
	}
	
}




public class StackUsingQueues {

	public static void main(String[] args) {

		MyStackUsingQueue stack=new MyStackUsingQueue();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(8);
	//	stack.printStack();
		
		stack.pop();
		System.out.println();
		//stack.printStack();
		
		
		System.out.println(isParsingCorrect("()(){}{"));
		System.out.println(isValid("{()}}"));
		
		
		System.out.println("findDuplicateParanthesis  "); 
		//findDuplicateParanthesis("(((a+b))*((c+d)))");
		findDuplicateParanthesis("(((a+(b)))+(c+d))");
		
	}

	
	static boolean isParsingCorrect(String str){
		
		boolean isParsable=true;
		
		
		HashMap<Character,Character> map=new HashMap<Character,Character>();
		map.put('{', '}');
		map.put('(', ')');
		map.put('[', ']');
		
		
		Stack<Character> stack=new Stack<Character>();
		
		
		char[] aa=str.toCharArray();
		
		for(char a:aa){
			
			if(map.keySet().contains(a)){
				stack.push(a);
			}else if(!stack.isEmpty() && ((Character)a).equals(map.get(stack.peek()))){
				stack.pop();
			}else if(map.values().contains(a) && stack.isEmpty()){
				return false;
			}
			
			
		}
		
		if(!stack.isEmpty())
			isParsable=false;
		
		return isParsable;
	}
	
	public static void findDuplicateParanthesis(String str){
		
		//     (((a+(b)))+(c+d))
		int counter=0;
		char[] array=str.toCharArray();
		
		Stack<Character> s1=new Stack<Character>();
		Stack<Character> s2=new Stack<Character>();
		
		for(char a:array){
			
			if( a=='(' ){
				s1.push(a);
			}else if( a != ')' ){
				
				if(counter>0){
					s1.clear();
					s2.clear();
					counter=0;
				}else{
					s2.push(a);
				}
				
			}else if( a == ')'  && !s1.isEmpty()){
				counter++;
				s1.pop();
				
				if(counter>1){
					System.out.println("Found on expression with duplicate ()");
					System.out.println(s2);
					s2.clear();
				}
			}
			
		}
				
	}
	
	
	public static void getMin(){
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(3);
		s.push(2);
		s.push(8);
		s.push(5);
		s.push(1);
		
		
	}


	public static boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
	 
		Stack<Character> stack = new Stack<Character>();
	 
		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
	 
			if (map.keySet().contains(curr)) {
				stack.push(curr);
			} else if (map.values().contains(curr)) {
				if (!stack.empty() && map.get(stack.peek()) == curr) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
	 
		return stack.empty();
	}
}
