package oneMorePractice;

public class ContainerWithMostWater {

	public static void main(String[] args) {

		int[] arr={5,4,4,6};
		
		System.out.println(getMaxVaol(arr));
		
	}

	
	static int getMaxVaol(int[] height) {
		if (height == null || height.length < 2) {
			return 0;
		}
	 
		int max = 0;
		int left = 0;
		int right = height.length - 1;
	 
		while (left < right) {
			max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
			if (height[left] < height[right])
				left++;
			else
				right--;
		}
	 
		return max;
	}
	
}
