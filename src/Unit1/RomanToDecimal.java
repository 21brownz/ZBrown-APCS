package Unit1;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public class RomanToDecimal {
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
            System.out.println("the center of the universe is here");
        }
    }
}
