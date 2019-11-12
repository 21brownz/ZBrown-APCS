import java.text.DecimalFormat;

public class Chapter8 {

    /*
    2 a) Write a method that returns true if a given string s is not empty and ends with a star ('*'), false otherwise.
     */
    public boolean shootingStars(String s){
        if(s.length() > 0){
            String end = "" + s.charAt(s.length()-1);
            return end.equals("*");
        }
        return false;
    }

    /*
    2 b) Write a method that returns true if a given string s has at least two characters and ends with two stars ('**'),
    false otherwise.
     */
    public boolean doubleStar(String s){
        if(s.length() > 0){
            String end = "" + s.charAt(s.length()-1) + s.charAt(s.length()-2);
            return end.equals("**");
        }
        return false;
    }

    /*
    3) Write a method that eliminates two dashes from a social security number in the format "ddd-dd-dddd"
    and returns a 9-character string of digits. For example, removeDashes("987-65-4321")
    returns a string equal to "987654321".
     */
    public String elimDashes(String s){
        return s.replaceAll("-","");
    }

    /*
    4 b) A string dateStr represents a date in the format "mm/dd/yyyy" (for example, 05/31/2019).
    Write a statement or fragment of code that changes dateStr to the format "dd-mm-yyyy" (for example, "31-05-2019").
    Make the code more general, so that it can handle dates written with or without leading zeroes
    (for example, it should convert "5/3/2019" into "03-05-2019").
     */
    public String dateFormat(String s){
        DecimalFormat decimalFormat = new DecimalFormat("00");
        String[] booleanCochran = s.split("/");
        int month = Integer.parseInt(booleanCochran[0]);
        int day = Integer.parseInt(booleanCochran[1]);
        return decimalFormat.format(day) + "-" + decimalFormat.format(month) + "-" + booleanCochran[2];
    }
    /*
    6) Write a scroll method that takes a string as a parameter, moves the first character to the end of the string,
    and returns the new string.
     */
    public String scroll(String s){
        return s.substring(1) +s.charAt(0);
    }

    /*
    7) Suppose a string holds a person's last name and first name, separated by a comma.
    Write a method convertName that takes such a string and returns a string where the first name is placed first
    followed by one space and then the last name. For example, convertName("von Neumann, John")
    should return "John von Neumann". HINT: trim() helps to get rid of extra white space.
     */
    public String nameFix(String s){
        String[] name = s.split(", ");
        return name[1] + " " + name[0];
    }

    /*8) A string contains only '0' and '1' characters and spaces. Write a method that takes such a string and makes
    and returns a "negative" string in which all the 0s are replaced with 1s and all the 1s with 0s.
    Your method must rely only on String's methods and not use any explicit iterations or recursion.
    */
    public String invert10(String s){
     s = s.replace("0","*");
     s = s.replace("1","0");
     return s.replace("*","1");
    }

    /*
    9) Write a method that determines whether all the characters in a string are the same,
    using only library String methods, but no loops or recursion. HINT: There are several approaches.
    For example, see question 6 .
     */
    public boolean sameString(String s){
        return (s.substring(1) + s.charAt(0)).equals(s);
    }

    /*
    11) Write a method cutOut that removes the first of a given substring (if found) from a given string. For example:
     */
    public String cutOut(String s, String c){
        return s.replaceFirst(c,"");
    }

    /*
    main method just for testing
     */
    public static void main(String[] args) {
        Chapter8 chapter8 = new Chapter8();
        String bin = "0101011001101010101100";
        System.out.println(bin);
        System.out.println(chapter8.invert10(bin));
    }
    /*
    15) Write and test a method that tests whether a given string contains only digits.
     */
    public boolean onlyDigits(String s){
        return Integer.toString(Integer.parseInt(s)).equals(s);
    }
}
