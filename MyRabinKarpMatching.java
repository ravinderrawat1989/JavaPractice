package oneMorePractice;

public class MyRabinKarpMatching {

	public static void main(String[] args) {

		//match("THIS IS A TEST TEXT","TEST");
		match("11AAAABAA24AABA","AABA");
		
	}

	
	public static void match(String a,String b ){
		
		char[] arr1=a.toCharArray();
		char[] arr2=b.toCharArray();
		
		
		
		for(int i=0;i<=arr1.length - arr2.length ;i++){
			int counter=0;
			for(int j=0;j<arr2.length;j++){
				counter++;
				if(arr1[i+j] != arr2[j])
					break;
				else if(counter == arr2.length)
					System.out.println("Found at index" + i);
				
			}
			
		}
			
	}
}
