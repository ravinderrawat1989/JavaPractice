
public class LengthLastWord {

	public static void main(String[] args) {
		
		String s="HelloWorld ";
		
		String[] arr=s.split(" ");
		
		
		if(arr.length==0 || arr.length == 1){
			System.out.println("none");
		}else {
			System.out.println(arr[arr.length-1]);
		}
	}

}
