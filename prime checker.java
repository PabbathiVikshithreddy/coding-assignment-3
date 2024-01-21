public class PrimeChecker {

    public static int isPrime(int N) {
        if (N <= 1) {
            return 0; // 0 and 1 are not prime numbers
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return 0; // N is divisible by a number other than 1 and itself, not prime
            }
        }

        return 1; // N is a prime number
    }

    public static void main(String[] args) {
        int input = 7;
        int result = isPrime(input);

        if (result == 1) {
            System.out.println(input + " is a prime number.");
        } else {
            System.out.println(input + " is not a prime number.");
        }
    }
}
