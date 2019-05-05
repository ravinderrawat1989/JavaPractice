package oneMorePractice;

public class KnapSackNoRepition {

	public static void main(String[] args) {

		int[] weights={5,4,6,3};		
		int[] values={10,40,30,50};
		
		System.out.println(getMaxValueKnapSack(weights,values,10,4));
		
	}

	static int getMaxValueKnapSack(int[] weights,int[] values,int maxWt,int itemCount){
	
		int[][] arr=new int[itemCount+1][maxWt+1];
		
		for(int i=0;i<itemCount+1;i++)
			arr[i][0]=0;
		
		for(int i=0;i<maxWt+1;i++)
			arr[0][maxWt]=0;
		
		for(int item=1;item<=itemCount;item++){
						
			for(int wt=1;wt<=maxWt;wt++){
				
				if(weights[item-1] <= wt ){
					arr[item][wt]=Math.max( arr[item-1][wt], values[item-1]+arr[item-1][wt-weights[item-1]]  );
				}
			}
		}
		
		for(int[] rows:arr){
			for(int i:rows){
				System.out.format("%8d",i);
			}
			System.out.println();
		}
			
		
		
		return arr[itemCount][maxWt];
	}
	
}
