package Unit1;

/**
 * A class of different math functions that are useful.
 * @author 21brownz
 * @version 1.0
 */

public class MathFunctions {

    /**
     * Figures out if the number is prime and returns true/false
     * @param number the number to process
     * @return the boolean answer
     */

    public static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }

    /**
     * Determine the prime factors of a number. 21brownz's favorite way to find primes.
     * @param number the input number to find the prime factor of
     * @param prime  the n'th prime factor to find
     * @return the value of the n'th prime factor
     */

    // TODO: 9/11/19 fix this guy
    public static int primeFactor(int number, int prime) {
        int[] primes = new int[number];
        int primeindex = 0;
        for (int i = 1; i < number; i++) {
        if(isPrime(i)){
            primes[primeindex] = i;
            System.out.println();
            primeindex++;
        }
        }
        return primes[prime];
    }

    /**
     * second way to determine if a number is prime or not, a little more cpu heavy but works with bigger numbers
     *
     * @param number number to process
     * @return the boolean answer
     */

    public static boolean isPrimeNumber(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}