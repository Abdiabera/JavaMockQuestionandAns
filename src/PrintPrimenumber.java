
public class PrintPrimenumber {
	   // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }


	public static void main(String[] args) {
		 int count = 0;
	        int num = 2;
	        
	     

	        System.out.println("First 50 prime numbers:");

	        while (count < 50) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	                count++;
	            }
	            num++;
	        }
	    }
}