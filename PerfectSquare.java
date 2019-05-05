
public class PerfectSquare {

	public static void main(String[] args) {

		System.out.println(isPerfectSquare(3));
	}

	
	public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(mid == 0 || mid < num/mid){
                left = mid +2;
            }else if(mid == num/mid && num%mid == 0){
                return true;
            }else{
                right = mid-1;
            }
        }

        return false;
    }
}
