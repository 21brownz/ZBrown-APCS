/*
@author: Zach Brown
@description: A simple program to sing School Days but nerdier
*/
package Unit1;
import java.util.Scanner;

/**
 * SimpleIOMath sings the song School Days plus some math about the user's age and favorite number.
 * @author 21brownz
 * @version 9/11/19
 */
public class SimpleIOMath {
    /**
     * The user's name.
     */
    String name;
    /**
     * The user's age.
     */
    int age;
    /**
     * The user's favorite number.
     */
    int fnumber;

    /**
     * The entry point of SimpleIOMath
     *
     * @param args the input arguments for the application
     */
    public static void main(String[] args) {
        SimpleIOMath simpleIOMath = new SimpleIOMath();
        simpleIOMath.promptUser();
        simpleIOMath.printInfo();

    }

    /**
     * Prompt the user for their data.
     */
    public void promptUser() {

        Scanner scan = new Scanner(System.in);
        System.out.println("* sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        System.out.println("What is your name?");
        name = scan.nextLine();
        System.out.println("How old are you?");
        boolean tryinput = true;
        while(tryinput) {
            try {
                age = Integer.parseInt(scan.nextLine());
                tryinput = false;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("please enter a valid age");
            }
        }

        System.out.println("What is your favorite number?");
        tryinput = true;
        while(tryinput) {
            try {
                fnumber = Integer.parseInt(scan.nextLine());
                tryinput = false;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("please enter a valid number");
            }
        }
    }

    /**
     * Print the user's info plus some arithmetic.
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
        if(MathFunctions.isPrime(age)){
            System.out.println(age + " is a prime number");
        }else{
            for (int i = 2; i <age; i++){
                if(MathFunctions.isPrime(i)){
                    if(age % i == 0){
                        System.out.println("The first prime factor of " + age + " is: " +i);
                        break;
                    }
                }
            }
        }
        System.out.println("Your favorite number is: " +fnumber);
        System.out.println("Your favorite number squared is " +fnumber*fnumber);
    }
}