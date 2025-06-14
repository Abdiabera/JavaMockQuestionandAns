import java.util.Arrays;

public class ArrayCopytoArray {
	//copy from one array arr to another empty array output and print it


	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50}; // Original array
        int[] output = new int[arr.length]; // Empty array of same size

        // Copying elements
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i];
        }

        // Printing the copied array
        System.out.print("Copied array: ");
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
