import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {

		int left=1;
		int right=22;
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		
		for(int i=left;i<=right;i++) {
			
			boolean isNot=false;
			int k=i;
			while( k != 0 ) {

				int a=k%10;
				
				if(a==0)
					{isNot=true;break;}
				
				if( i%a != 0 ) {					
					isNot=true;
					break;
				}
				k=k/10;

			}
			
			if( isNot == false )
				list.add(i);
			
		}
		
		System.out.println(list);
	}

}
