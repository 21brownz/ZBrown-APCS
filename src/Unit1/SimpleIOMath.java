/*@author: Zach Brown

*/
package Unit1;

import java.util.Scanner;

public class SimpleIOMath {
    String name;
    int age;
    int fnumber;

    public static void main(String[] args) {
        SimpleIOMath simpleIOMath = new SimpleIOMath();
        simpleIOMath.promptUser();
        simpleIOMath.sing();
        simpleIOMath.printInfo();

    }

    public void promptUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("* sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        System.out.println("What is your name?");
        name = scan.nextLine();
        System.out.println("How old are you?");
        age = Integer.parseInt(scan.nextLine());
        System.out.println("What is your favorite number?");
        fnumber = Integer.parseInt(scan.nextLine());

    }

    public void printInfo() {
        int[] prime = new int[0];
        System.out.println("your name is: " + name);
        System.out.println("your age is: " + age);
        int nextbirthday = age+1;
        System.out.println("at your next birthday, you will turn: " + nextbirthday);
        System.out.println("The first prime factor of " + age + " is: ");
    }

    public void sing() {
        System.out.println("I'm gonna teach you how to sing it out");
        System.out.println("Come on, come on, come on");
        System.out.println("Let me tell you what it's all about");
        System.out.println("Reading, writing, arithmetic");
        System.out.println("Are the branches of the learning tree");
    }
}