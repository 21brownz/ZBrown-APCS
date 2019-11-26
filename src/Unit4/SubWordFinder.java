package Unit4;

import java.util.ArrayList;
import java.util.Scanner;

public class SubWordFinder implements WordFinder{

    public SubWordFinder() {

    }

    @Override
    public void populateDictionary() {
        Scanner in = null;
        String alpha = "abcdefghijklmnopqrstuvwxy";
        try{
            in = new Scanner(System.in);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<SubWord> getSubWords() {
        return null;
    }

    @Override
    public boolean inDictionary(String word) {
        return false;
    }
}
