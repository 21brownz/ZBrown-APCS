package Unit1;


/**
 * A Class for converting roman numerals to an integer.
 * Full accuracy and error checking is not implemented
 * @author 21brownz
 * @version 1.4.2
 */
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

    /**
     * Converts a roman numeral to a integer
     * @param roman the roman numeral input
     * @return the integer output
     */
    //TODO: add ability to count the number of pairs in a given roman numeral. just look it up on StackExchange.
    public static int romanToDecimal(String roman) {
        String s = roman.toUpperCase();
    int sum = 0;
    int v = 0;
    for (int i = 0; i < s.length(); i++) {
        String letter = s.substring(i, i + 1);
        v += value(letter);
        if (v == 0)
            return -1;
        else
            sum = v;
    }
    if (s.contains("IV") || s.contains("IX")) {
        sum -= 2;
    }
    if (s.contains("XL") || s.contains("XC")) {
        sum -= 20;
    }
    if (s.contains("CD") || s.contains("CM")) {
        sum -= 200;
    }
    return sum;
}

    /**
     * Main method.
     * @param args the program arguments
     */
    public static void main(String[] args){
        if (args.length == 0) {
            System.out.print("No Arguments!");
        } else {
            for (String arg : args) {
                int val = RomanToDecimal.romanToDecimal(arg.toUpperCase());
                if(val == -1){
                    System.out.println(arg + " ==> " + "invalid");
                }else{
                    System.out.println(arg + "==>" + val);
                }
            }
        }
    }
}
