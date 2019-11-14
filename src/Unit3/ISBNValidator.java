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
        validnums = new String[1102];
        invalidnums = new String[1102];
        delimiter = "-"; //sets delim for char between chunks of the ISBN
    }

    /**
     * imports .dat file, calls isValidISBN method and stores Strings into corresponding arrays
     */
    public void importData() {
        try{
            Scanner scan = new Scanner(new File("isbnfiles/isbn1.dat"));
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
        for (int i = 0; i <isbn.length; i++) {
            if(i%2 == 1){
                total += 3 * isbn[i];
            }else{
                total += isbn[i];
            }
        }
        return total % 10 == 0;
    }

    /**
     * output the user-picked ISBN list or quit the application
     */
    public void runProgram() {
        int selection = 0;
        Scanner scan = new Scanner(System.in);
        while (selection != 3) {
            try {
                System.out.println("All ISBN data has been imported and validated. Would you like to:");
                System.out.println("\t 1) View all valid ISBN numbers");
                System.out.println("\t 2) View all invalid ISBN numbers");
                System.out.println("\t 3) Quit");
                System.out.print("Your selection: ");

                selection = scan.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (selection == 1) {
                for (int i = 0; i <validnums.length; i++) {
                    if(validnums[i] != null){
                        System.out.println(validnums[i]);
                    }
                }
                selection = 0;
                System.out.println();
            } else if (selection == 2) {
                for (int i = 0; i <invalidnums.length; i++) {
                    if(invalidnums[i] != null){
                        System.out.println(invalidnums[i]);
                    }
                }
                System.out.println();
            }
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
