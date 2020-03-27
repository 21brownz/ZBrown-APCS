package Unit2;

import java.util.Scanner;

public class OneTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number 1-10 (or 0 to quit):");
        int number = scan.nextInt();
        boolean run =true;
        while(run) {
            switch (number) {
                case 1:
                    System.out.println("Buckle your shoe");
                case 2:
                    System.out.println("Buckle your shoe");
                case 3:
                    System.out.println("Shut the door");
                case 4:
                    System.out.println("Shut the door");
                case 5:
                    System.out.println("Pick up sticks");
                case 6:
                    System.out.println("Pick up sticks");
                case 0:
                    System.out.println("Bye");
                    run = false;
            }
        }
    }
}
