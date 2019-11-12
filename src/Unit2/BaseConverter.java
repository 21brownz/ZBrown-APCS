package Unit2;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * A class to do base conversions.
 * With help from 22browner and 21scurria
 * @author 21brownz
 * @version 1.0
 *
 */
public class BaseConverter {
    String hexMap = "0123456789ABCDEF";
    String[] hexStr = "0123456789ABCDEF".split("");


    /**
     * Converts input to raw
     * @param num input number
     * @param fromBase base input is in
     * @return raw
     */
    public int strToInt(String num, String fromBase){
    int base = Integer.parseInt(fromBase), sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += hexMap.indexOf(num.charAt(i)) * Math.pow(base, num.length() - 1 - i);
        }
        return sum;
    }

    /**
     * Converts raw back to expected base
     * @param num input raw
     * @param toBase base to convert to
     * @return output as string
     */
    public String intToString(int num, int toBase){
    int power = 0;
    while(Math.pow(toBase,power)<num){
        power +=1;
    }
    power -=1;
    StringBuilder stringBuilder = new StringBuilder();
    while(num > 0){
        int placeNumb = (int)(num/(Math.pow(toBase,power)));
        stringBuilder.append(hexStr[placeNumb]);
        num -= placeNumb*(Math.pow(toBase,power));
        power -= 1;
    }
    return String.valueOf(stringBuilder);
    }

    /**
     * actually do the conversion eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
     */
    public void inputConvertPrintWrite() throws IOException {
        PrintStream ps = new PrintStream("boolean_cochran.dat");
        Scanner scan = new Scanner(new File("datafiles/values10.dat"));
            BaseConverter baseConverter = new BaseConverter();
            while (scan.hasNextLine()){
                String[] l = scan.nextLine().split("\t");

                if(Integer.parseInt(l[1]) < 2 || Integer.parseInt(l[1]) > 16){
                    System.out.printf("Invalid input base %s\n", l[1]);
                    continue;
                }

                if(Integer.parseInt(l[2]) < 2 || Integer.parseInt(l[2]) > 16){
                    System.out.printf("Invalid output base %s\n", l[2]);
                    continue;
                }

                String converted = intToString(strToInt(l[0], l[1]), Integer.parseInt(l[2]));
                System.out.printf("%s base %s = %s base %s\n", l[0], l[1], converted, l[2]);
                ps.printf("%s\t%s\t%s\t%s\n", l[0], l[1], converted, l[2]);
            }
            ps.close();
            scan.close();

    }

    /**
     * The entry point of application. Executes a conversion.
     * BONUS: every time this method is called I lose a brain cell.
     * @param args the input arguments
     */
    public static void main(String[] args) throws IOException {
    BaseConverter baseConverter = new BaseConverter();
    baseConverter.inputConvertPrintWrite();
    }
}
