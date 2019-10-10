
package Unit2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * A class that calculates a person's BMI
 * @author 21brownz
 * @version 1.1
 */
public class BMICalculator {

    /** Convert English to metric units, perform the BMI calculation.
     * NOTE: this method must properly handle bad data
     * @param in height in meters
     * @param lbs weight in kilograms
     * @return the user's BMI expressed in kg/m^2 */

    public static double computeBMI(int in, int lbs){
        double m = in * 0.0254;
        double kg = lbs * 0.454;
        if(kg <= 0 || m <= 0){
            return 0;
        }
        return kg/(m*m);
    }

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your height in feet and inches (Ex 6'1\"): ");
        String htStr = scan.nextLine();
        System.out.print("enter your weight in pounds: ");
        String wtStr = scan.nextLine();

        int feet = Integer.parseInt(htStr.substring(0, htStr.indexOf("\'")));
        int in = Integer.parseInt(htStr.substring(htStr.indexOf("\'")+1, htStr.indexOf("\"")));
        int weight = Integer.parseInt(wtStr);
        in += feet*12;
        System.out.println("Your BMI, expressed as weight(kg)/height(m)^2: " + decimalFormat.format(computeBMI(in, weight)));
    }
}
