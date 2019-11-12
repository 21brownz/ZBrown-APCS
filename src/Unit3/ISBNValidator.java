package Unit3;

import java.io.File;
import java.util.Scanner;

/**
 * Command Line tool to validate ISBN numbers provided by the user
 * @author 21brownz
 * @version 1.0
 */
public class ISBNValidator {

    /*
    Instance variables
     */
    private String[] validnums;
    private String[] invalidnums;
    private String delimiter;


    public ISBNValidator(){
        validnums = new String[100];
        invalidnums = new String[100];
        delimiter = "-"; //sets delim for character between chunks of the ISBN
    }

    /**
     * imports .dat file, calls isValidISBN method and stores Strings into corresponding arrays
     */
    public void importData() {
        try{
            Scanner scan = new Scanner(new File("isbnfiles/booleancochran.dat"));
            int i = 0;
            int j = 0;
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                if(isValidISBN(line)){
                    validnums[i] = line;
                    i++;
                }else{
                    invalidnums[j] = line;
                    j++;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * determines validity of supplied ISBN number, returns boolean whether ISBN is valid.
     * @param input the input ISBN number
     * @return the validity of the ISBN number
     */
    public boolean isValidISBN(String input){
        String replace = input.replace(delimiter, "");
        int[] isbn = new int[replace.length()];
        for (int i = 0; i <isbn.length; i++) {
            isbn[i] = Integer.parseInt(String.valueOf(replace.charAt(i)));
        }
        int total = 0;
        for (int value : isbn) {
            total += value;
        }
        return total % 10 == 0;
    }

    /**
     * output the user-picked ISBN list or quit the application
     */
    public void runProgram(){
        for (int i = 0; i <validnums.length; i++) {
            System.out.println(validnums[i]);
        }
        System.out.println("end of valid numbers");
        for (int i = 0; i <invalidnums.length; i++) {
            System.out.println(invalidnums[i]);
        }
    }

    /**
     * entry point
     * @param args the args
     */
    public static void main(String[] args){
        ISBNValidator app = new ISBNValidator();
        System.out.println("* ISBN Validator Program *");
        System.out.println("...Importing data...");
        app.importData(); // imports data from the text file
        app.runProgram(); // runs using a while loop; see examples
        System.out.println("* End of Program *");
    }
}
