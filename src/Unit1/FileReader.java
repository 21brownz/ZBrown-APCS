package Unit1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class with various different methods for loading files.
 * @author 21brownz
 * @version 1.0.1
 */

public class FileReader {

    /**
     * Loads a given file from its real or relative path
     * @param file the string containing the path of the file
     * @return the initialized file
     */

    public File loadfile(String file){
        URL url = FileReader.class.getResource(file); // finds the full path of the file being loaded from the name/ relative path
        return new File(url.getPath()); // initialize the file object
    }

    public String fileString(String file) {
        String contents;
        URL url = FileReader.class.getResource(file);
        File filevar = loadfile(file);
        try {
            return new Scanner(filevar).useDelimiter("\r").next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
        public String[] arrayString(String file) {
            String contents;
            URL url = FileReader.class.getResource(file);
            File filevar = loadfile(file);
            try{
                String s = new Scanner(filevar).useDelimiter("\r").next();
                return s.split("\\W+");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return new String[0];
    }
 }
