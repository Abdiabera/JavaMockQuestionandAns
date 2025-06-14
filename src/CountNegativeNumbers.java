
public class CountNegativeNumbers {
	//count the total negative numbers
	// {3, 2, -1, 9, -8, 6, -2,-15,20,11,-13}
	//count =5
	
	public void countNegative(int[] arr) {
		int count=0;
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		 int arr[] = {3, 2, -1, 9, -8, 6, -2, -15, 20, 11, -13};
	        int negativeCount = 0;

	        for (int num : arr) {
	            if (num < 0) {
	                negativeCount++;
	            }
	        }

	        System.out.println("Number of negative elements: " + negativeCount);
	    }
	}