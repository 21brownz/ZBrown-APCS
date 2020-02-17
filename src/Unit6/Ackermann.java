package Unit6;

import java.util.Scanner;

public class Ackermann {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int m;
        System.out.println("Enter m: ");
        m = reader.nextInt(); //Reads integer from keyboard
        int n;
        System.out.println("Enter n: ");
        n = reader.nextInt(); //Reads integer from keyboard
        System.out.println("ackermann(" + m + ", " + n + ") = " + ackermann(m, n));
    }

    private static int ackermann(int m, int n){
        if(m == 0){
            return  n + 1;
        }
        if(n == 0){
            return ackermann(m - 1, 1);
        }
        return ackermann(m - 1, ackermann(m, n - 1));
    }
}