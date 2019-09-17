package Unit1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class RomanToDecimal {
    private String[] chars = {"I", "V", "X", "L", "C", "D", "M"};
    private int[] values = {1, 5, 10, 50, 100, 500, 1000};

        private int value(String roman){
            for (int i = 0; i < chars.length; i++) {
                if (roman.equals(chars[i])){
                    return values[i];
                }
            }
    return 0;
    }
    public static void main(String[] args){
        FileReader file = new FileReader();
        Scanner scanner = null; //initialize the scanner outside the try/catch statement so you don't oof yourself trying to write a shit ton of code in one statement.
        try{
            scanner = new Scanner(file.loadfile("rtd_tests.txt"));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        //check to make sure the scanner isn't null so you don't throw a null pointer and off yourself.
        if(scanner != null){
            int numeralcount = 1;
            while(scanner.hasNextLine()) numeralcount++;
        }
    }
}
