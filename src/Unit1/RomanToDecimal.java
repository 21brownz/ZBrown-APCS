package Unit1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class RomanToDecimal {
    private static String[] chars = {"I", "V", "X", "L", "C", "D", "M"};
    private static int[] values = {1, 5, 10, 50, 100, 500, 1000};

        private static int value(String roman){
            for (int i = 0; i < chars.length; i++) {
                if (roman.equals(chars[i])){
                    return values[i];
                }
            }
    return 0;
    }

public static int romanToDecimal(String roman){
    int sum = 0;
    int v = 0;
    for(int i = 0; i < roman.length(); i++) {
        String letter = roman.substring(i, i+1);
        v += value(letter);
        if(v == 0)
            return -1;
        else
            sum += v;
    }
if(roman.contains("IV"))
        sum -= 2;
else
    return sum;

return 0;
        }

    /*public static void main(String[] args) {
        String num1 = "XIV";
        String num2 = "XXX_benbrowner_XXX";
            System.out.println(num1 + " ==> " + romanToDecimal(num1.toUpperCase()));
            System.out.println(num2 + " ==> " + romanToDecimal(num2.toUpperCase()));
    }*/

    public static void main(String[] args){
     FileReader fileReader = new FileReader();
        System.out.println(fileReader.fileString("rtd_tests.txt"));
        }
    }
