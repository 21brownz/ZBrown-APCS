package Unit1;

import java.util.Scanner;

public class HolyGrail {
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
            System.out.println("What is the average air speed velocity of a laden swallow?");
                String airspeed = scan.nextLine();
            System.out.println("King Arthur says, \"You have to know these things when you're a king, you know.\"");
            System.out.println("Your name is: " +name);
            System.out.println("Your quest is: " +quest);
            System.out.println("Your favorite color is: " +favcolor);
            if (airspeed.equals("What do you mean, an African or European Swallow?")){
                System.out.println("The King of Computer Science I see!");
            }

    }

}