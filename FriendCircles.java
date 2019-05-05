import java.util.LinkedList;

public class FriendCircles {

	public static void main(String[] args) {


//		                         
//	
		
//		int[][] M= {{1,1,0},
//				   {1,1,1},
//				   {0,1,1}   };


//		
//		int[][] M= { {1,0,0,1},
//					 {0,1,1,0},
//					 {0,1,1,1},		             
//					 {1,0,1,1} };
		
		

				
//
//		int[][] M =  { {1,1,0},
//		               {1,1,0},
//		               {0,0,1} };
		
		int[][] M= {
					{1,0,0},
					{0,1,0},
					{0,0,1}
				   };		

		LinkedList<Integer> list=new LinkedList<>();
		int count=0;	

		for ( int i=0;i< M.length;i++) {
			
			for ( int j=0;j< M.length;j++) {
				
				if(i==j)
					continue;
				
				if(M[i][j] == 1) {											
				
					if(!list.contains(i) || !list.contains(j)) {
												
						if( !list.contains(i))
							list.add(i);
						
						if( !list.contains(j))
							list.add(j);
						
					}
					
				}
				
			}
			
			
		}
		
		boolean isMissing=false;
		int counter=0;
		for(int i=0;i<M.length;i++) {
			
			if(!list.contains(i) ) {
				counter++;
			}
			
		}
		
		if(counter==0)
			System.out.println(1);
		else if(!list.isEmpty())
			System.out.println(counter+1);
		else
			System.out.println(counter);
	}

}
