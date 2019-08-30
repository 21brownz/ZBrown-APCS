/**
 * @author 21brownz
 * @version WED 9/4/2019
 * HolyGrail is a simple I/O application
 *
 */

package Unit1;

import java.util.Scanner;

/**
 * The type Holy grail.
 */
public class HolyGrail {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("* A chat with a bridge keeper *");
        System.out.println("Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");
        System.out.println("What is your name?");
            String name = scan.nextLine();
        System.out.println("What is your quest?");
            String quest = scan.nextLine();
        System.out.println("What is your favorite color?");
            String favcolor = scan.nextLine();
        System.out.println("King Arthur says, \"You have to know these things when you're a king, you know.\"");
        System.out.println("Your name is: " +name);
        System.out.println("Your quest is: " +quest);
        System.out.println("Your favorite color is: " +favcolor);
    }
}
