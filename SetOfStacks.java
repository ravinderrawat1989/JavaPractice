import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SetOfStacks {

	List<Stack<Integer>> setOfStacks=new ArrayList<Stack<Integer>>();
	int sizeThreshold=5;
	int currentStackIndex=0;
	
	
	public static void main(String[] args) {
		
		
		
	}
	
	public int pop(){
		
		if(setOfStacks.get(currentStackIndex).isEmpty()  && currentStackIndex !=0){
			currentStackIndex--;			
		}		
		return setOfStacks.get(currentStackIndex).pop();
	}

	
	public int popAt(int index){
		
		return setOfStacks.get(index).pop();
		
	}
	
	
	
	public void push(int x){
		
		if(setOfStacks.size()==0){
			currentStackIndex=0;
			setOfStacks.add(new Stack<Integer>());
			setOfStacks.get(currentStackIndex).add(x);
		}else if(setOfStacks.get(currentStackIndex).size()<sizeThreshold){
			setOfStacks.get(currentStackIndex).add(x);
		}else if(setOfStacks.get(currentStackIndex).size() == sizeThreshold){
			currentStackIndex+=1;
			setOfStacks.add(new Stack<Integer>());
			setOfStacks.get(currentStackIndex).add(x);
		}
		
		
		
	}

}
