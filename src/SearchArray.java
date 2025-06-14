
public class SearchArray {
	
	

	public static void main(String[] args) {
		 int[] arr = {5, 2, 6, 3, 7, 8, 4, 1};
	        int searchKey = 8;
	        boolean found = false;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == searchKey) {
	                System.out.println("Element " + searchKey + " found at index " + i);
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Element " + searchKey + " not found in the array.");
	        }
	    }
	}

