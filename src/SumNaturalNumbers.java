
public class SumNaturalNumbers {
	


	public static void main(String[] args) {

		 int n = 20; // You can change this value to any positive number
	        int sum = 0;

	        System.out.print("Sum sequence: ");
	        for (int i = 0; i <= n; i++) {
	            sum += i;
	            System.out.print(i);
	            if (i < n) {
	                System.out.print("+");
	            }
	        }

	        System.out.println("\nTotal sum = " + sum);
	    }
	}