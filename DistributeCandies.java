import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistributeCandies {

	public static void main(String[] args) {

		int[] arr=  {1,1,2,2,3,3,2,2};
		
		Set<Integer> nums = new HashSet<>();
		
		
        for (int candy : arr) {
            nums.add(candy);
        }
        
        
        int numNums = nums.size();
        int numTarget = arr.length / 2;
        System.out.println(numNums >= numTarget ? numTarget : numNums);
		
	}

}
