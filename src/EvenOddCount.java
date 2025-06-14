
public class EvenOddCount {
	

	public static void main(String[] args) {
		  int[] arr = {2, 5, 6, 10, 12, 9, 13, 18, 20};

	        int evenCount = 0;
	        int oddCount = 0;

	        for (int num : arr) {
	            if (num % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }

	        System.out.println("Even numbers count: " + evenCount);
	        System.out.println("Odd numbers count: " + oddCount);
	    }
	}