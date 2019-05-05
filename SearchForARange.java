
public class SearchForARange {

	public static void main(String[] args) {
		
		int array[]= {5, 7, 7, 8, 8, 10};
		System.out.println(searchRange(array,7));
	}

	
	static String searchRange(int[] array,int a){
		
		StringBuffer str=new StringBuffer();
		
		boolean firstOccurence=false;
		for(int i=0;i<array.length;i++){
			
			if(array[i]==a && firstOccurence==false){
				firstOccurence=true;
				str.append("[");
				str.append(i);
				str.append(" , ");
			}else if(firstOccurence==true && array[i]==a ){
				str.deleteCharAt(str.indexOf(",")+1);				
				str.append(i);
			}else if(firstOccurence==true && array[i]!=a)
				{str.append("]"); break;}
			
		}
		
		return str.toString();
	}
	
}
