/*
@author: Zach Brown
@description: A simple program to sing School Days but nerdier
*/
package Unit1;
import java.util.Scanner;

/**
 * Sings School Days
 */
public class SimpleIOMath {
    /**
     * The user's name
     */
    String name;
    /**
     * The user's age
     */
    int age;
    /**
     * The user's favorite number
     */
    int fnumber;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SimpleIOMath simpleIOMath = new SimpleIOMath();
        simpleIOMath.promptUser();
        simpleIOMath.printInfo();

    }

    /**
     * Prompt user.
     */
    public void promptUser() {

        Scanner scan = new Scanner(System.in);
        System.out.println("* sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        System.out.println("What is your name?");
        name = scan.nextLine();
        System.out.println("How old are you?");
        boolean run = true;
        while(run) {
            try {
                age = Integer.parseInt(scan.nextLine());
                run = false;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("please enter a valid age");
            }
        }

        System.out.println("What is your favorite number?");
        run = true;
        while(run) {
            try {
                fnumber = Integer.parseInt(scan.nextLine());
                run = false;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("please enter a valid number");
            }
        }
    }

    /**
     * Print user's info
     */
    public void printInfo() {
        System.out.println("I'm gonna teach you how to sing it out");
        System.out.println("Come on, come on, come on");
        System.out.println("Let me tell you what it's all about");
        System.out.println("Reading, writing, arithmetic");
        System.out.println("Are the branches of the learning tree");
        System.out.println("your name is: " + name);
        System.out.println("your age is: " + age);
        int nextbirthday = age + 1;
        MathFunctions mathFunctions = new MathFunctions();
        System.out.println("at your next birthday, you will turn: " + nextbirthday);
        System.out.println("The first prime factor of " + age + " is: ");
        if(MathFunctions.isPrime(age)){
           System.out.print(1);
        }else{
            for (int i = 2; i <age; i++) {
                if(MathFunctions.isPrime(i)){
                    if(age % i == 0){
                        System.out.print(i);
                        break;
                    }
                }
            }
        }
        System.out.println("Your favorite number is: " +fnumber);
        System.out.println("Your favorite number squared is:" +fnumber*fnumber);
    }
}