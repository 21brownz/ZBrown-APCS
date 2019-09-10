package Unit1;
import org.jetbrains.annotations.Contract;

/**
 * based off of ideas written by prime67. credit where credit is due...
 * Java Program to check if a number is Prime or Not. This program accepts a
 * number from command prompt and check if it is prime or not.
 * @author 21brownz
 *
 */
public class MathFunctions {

    public static void main(String[] args) {

    }

    /*
     * Java method to check if an integer number is prime or not.
     * @return true if number is prime, else false
     */
    @Contract(pure = true)
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

    @Contract(pure = true)
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


    /*
     * Third way to check if a number is prime or not.
     */
    public static boolean isPrimeOrNot(int num) {
        if (Math.abs(num) == 0 || Math.abs(num) == 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if ((num * num - 1) % 24 == 0) {
            return true;
        } else {
            return false;
        }
    }
}