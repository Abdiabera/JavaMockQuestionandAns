
public class SumArray {
	
	//Write a Java program to sum values of an array
	//int[] arr={2,5,6,10,12,9,13,18,20};
	//2+5+6+10+12+9+13+18+20


	public static void main(String[] args) {
		 int[] arr = {2, 5, 6, 10, 12, 9, 13, 18, 20};
	        int sum = 0;

	        System.out.print("Sum sequence: ");
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	            System.out.print(arr[i]);
	            if (i < arr.length - 1) {
	                System.out.print(" + ");
	            }
	        }

	        System.out.println("\nTotal sum = " + sum);
	    }
	}