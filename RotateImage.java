public class RotateImage {

	public static void main(String[] as){
	
		int[][] matrix={{1,2,3,4},{5,6,7,8},{9,0,11,12}};
		
		
		for(int i=0;i<3;i++)
			{
				for(int j=0;j<4;j++)
					System.out.print(matrix[i][j] +" ");
				
				System.out.println();
			}
	
	
		
		
		
		System.out.println();
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
				System.out.print(matrix[i][j] +" ");
			
			System.out.println();
		}
	
	
	}
	
}
