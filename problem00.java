public class problem00 {
    // Find prime numbers between 1-100
    public static void main(String[] args) {
        for (int num = 2; num <= 100; num++) { // Start from 2, as 1 is not prime
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(num); j++) { // Check divisibility up to the square root
                if (num % j == 0) { // If num is divisible by j, it's not prime
                    isPrime = false;
                    break; // No need to check further
                }
            }

            if (isPrime) {
                System.out.println(num + " ");
            }
        }
    }
}