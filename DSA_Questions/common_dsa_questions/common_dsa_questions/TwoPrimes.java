package common_dsa_questions;

public class TwoPrimes{
	
	
	public static void main(String[] args) {
		
		int a = 11;
		
		int b = 17;
		
		boolean isAPrime = isPrime(a);
        boolean isBPrime = isPrime(b);

        // Output the result
        if (isAPrime && isBPrime) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    // Helper function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
		
		
	}
}