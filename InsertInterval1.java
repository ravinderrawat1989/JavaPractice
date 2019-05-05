import java.util.Arrays;

public class InsertInterval1 {

	public static void main(String[] args) {

		int[][]  arr={{1,2},{3,5},{6,7},{8,10},{12,16}};
		//int[][]  arr={{1,3},{6,9}};
		int[] range={4,9};
		
		int foundRow=0;
		int foundCol=0;
		int lastvalid=0;
		boolean jusFound=false;
		for(int row=0;row<arr.length;row++){
			
			for(int col=0;col<arr[0].length;col++){
				
				if(arr[row][1] < range[0]){
					continue;	
				}else if (arr[row][1] > range[0]   ){
					
					if(jusFound==false)
					{	foundRow=row;
						jusFound=true;
						continue;
					}
					
					if(arr[row][1] < range[1]  ){
						continue;
					}else if(arr[row][1] > range[1]  && arr[row][0] < range[1] ){
						arr[foundRow][1]=arr[row][1];
					}else if(arr[row][1] > range[1]  && arr[row][0] > range[1] ){
						int h=row -1;
						lastvalid=row;
						if(arr[h][1] < range[1] ){
							arr[foundRow][1]=range[1];
						}else{
							arr[foundRow][1]=arr[h][1];
						}
						break;
					}
					
				}
				
				
				
			}			
			
		}
		
		
			int[][] a1=Arrays.copyOfRange(arr, 0, foundRow+1);
			int[][] a2=Arrays.copyOfRange(arr,lastvalid,arr.length);
			
			int[][] a3=new int[a1.length + a2.length][2];
			
			System.arraycopy(a1,0,a3,0,a1.length);
			System.arraycopy(a2,0,a3,a1.length,a2.length);
		
		
			for(int row=0;row<a3.length;row++){
			
				for(int col=0;col<a3[0].length;col++){
				
					System.out.print(a3[row][col] + " ");
				}
				System.out.println();
			}

		
	}

}
