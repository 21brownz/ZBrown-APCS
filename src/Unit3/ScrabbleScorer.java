package Unit3;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * An app that scores scrabble words using dictionary lookups
 * @author 21brownz
 * @version 1.0
 */
public class ScrabbleScorer {
    private String alphabet;
    private int[] points = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    private ArrayList<String> dictionary;

    /**
     * Instantiates a new Scrabble scorer.
     */
    public ScrabbleScorer(){
        alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        dictionary = new ArrayList<>();
    }

    /**
     * Builds the Dictionary
     */
    public void buildDictionary(){
        Scanner scan;
        try{
            scan = new Scanner(new File("dictionary/SCRABBLE_WORDS.txt"));
            while(scan.hasNext()){
                dictionary.add(scan.nextLine());
            }
            scan.close();
            Collections.sort(dictionary);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Checks if the word is in the dictionary
     * @param word the word
     * @return in dictionary
     */
    public boolean isValidWord(String word){
        word = word.toUpperCase();
        return Collections.binarySearch(dictionary, word) >= 0;
    }

    /**
     * Get word score int.
     * @param word the word
     * @return the score
     */
    public int getWordScore(String word){
        word = word.toUpperCase();
        int score = 0;
        for(int i = 0; i <word.length(); i++) {
           score += points[alphabet.indexOf(word.charAt(i))];
        }
        return score;
    }

    /**
     * The entry point of ScrabbleScorer
     * @param args the input CLAs
     */
    public static void main(String[] args) {
        ScrabbleScorer app = new ScrabbleScorer();
        app.buildDictionary();
        String word = "";
        System.out.println("* Welcome to the Scrabble Word Scorer app *");
        try{
            Scanner scan = new Scanner(System.in);
            while(!word.equals("0")){
                System.out.print("Enter a word to score or 0 to quit: ");
                word = scan.nextLine();
                if(app.isValidWord(word)){
                    System.out.println(word + " = " + app.getWordScore(word));
                }else{
                    System.out.println(word + " is not a valid word");
                }
            }
            System.out.println("Exiting the program, thanks for playing!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
