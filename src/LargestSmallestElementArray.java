
public class LargestSmallestElementArray {

	public static void main(String[] args) {
		 int[] numbers = {45, 22, 89, 11, 5, 67, 99, 34};

	        int min = numbers[0];
	        int max = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < min) {
	                min = numbers[i];
	            }
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	        }

	        System.out.println("Smallest element: " + min);
	        System.out.println("Largest element: " + max);
	    }
	}
