import java.util.Stack;

public class ReverseWordsString {

	public static void main(String[] args) {
		
		String str="the sky is blue";
		str=str.trim();
		
		StringBuffer stBuff=new StringBuffer(str.length());
		
		for(int i=str.split(" ").length -1; i>=0 ;i--){
			stBuff.append(str.split(" ")[i]).append(" ");
		}
		str=stBuff.toString();
		
		System.out.println(str);
		
		
		
		
		Stack<String> stack=new Stack<String>();
		
		for(int i=0; i<str.split(" ").length ;i++){
			stack.push(str.split(" ")[i]);
		}
		
		
		while(!stack.isEmpty())
			System.out.print (stack.pop() + " ");
		
	}

}
