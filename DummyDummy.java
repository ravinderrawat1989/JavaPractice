import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class DummyDummy {

	
	public static void main(String[] args) {
			int[] aa= {1,0,1,1,0};
			System.out.println(cellCompete(aa,3));
	
}

	
	 // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static List<Integer> cellCompete(int[] states, int days)
    {
    // WRITE YOUR CODE HERE
    List<Integer> list = new ArrayList<Integer>();
    
    for(int i=0;i<days;i++){
        
        for(int j=0;j<states.length;j++){
            
            if(j==0){
                if(states[j+1] == 1 )
                    list.add(1);
                else
                    list.add(0);
            }
            
            else if(j==states.length-1){
                 
                if(states[j-1] == 1 )
                    list.add(1);
                else
                    list.get(0);
                Math.pow(a, b)
            }
            
            
            else if(states[j-1] ==  states[j+1]){
                list.add(0);
            }else{
                list.re(1);
            }
            
            
        }
        
        
        
        
       
        //Now update array 
         for(int p=0;p<list.size();p++){
             states[p]=list.get(p);
         }
        
         if(i < days-2)
        	 	list.clear();
         
         Math.po
         
    }
    
    
    return list;
    }
	
	
	
	
	
	
	
	public static void main2(String[] args) {

			int[] aar= {1};
			
			int myNum=1;
			
			Arrays.sort(aar);
			
			for(int i =0;i < aar.length;i++) {
				
				if(aar[i] < myNum) {
					myNum=aar[i]+1;
				} else if (aar[i] == myNum) {
					myNum++;
				}
				
				
			}

			
			System.out.println(myNum);
	}

	
	
	
}
