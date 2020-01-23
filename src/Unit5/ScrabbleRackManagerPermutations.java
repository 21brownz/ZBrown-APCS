package Unit5;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScrabbleRackManagerPermutations {
    private ArrayList<String> tileRack;

    /** Constructor*/
    public ScrabbleRackManagerPermutations() {
        tileRack = new ArrayList<>();
        buildTileRack();
    }

    /**
     * builds the tile rack.
     */
    private void buildTileRack(){
        String[] alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ".split(""); //makes the tile array
        int[] distro = {9,2,2,4,12,2,3,2,9,1,1,4,2,6,8,2,1,6,4,6,4,2,2,1,2,1,2};
        for (int j = 0; j < alpha.length; j++)
            for (int i = 0; i < distro[j]; i++)
                tileRack.add(alpha[j]);
        Collections.shuffle(tileRack);
        int temp = tileRack.size();
        for (int i = 0; i < temp-7; i++) {
            tileRack.remove(rand(tileRack.size()-1));
        }
    }
/*  */
    /**
     * A helper for generating a random number
     * @param max the maximum of the random range
     * @return the random number
     */
    private static int rand(int max) {
        return (int) (Math.random() * (max + 1));
    }

    /**
     * Checks if the word is valid using some shenanigans pioneered by Ben and I
     * @param s the word being check'd
     * @return boolean whether the word is valid or not
     */
    private boolean isValid(String s) {
        ArrayList<String> temp = new ArrayList<>(tileRack);
        for (int i = 0; i < s.length(); i++) {
            if (!temp.remove(s.substring(i, i + 1)) && !temp.remove(" ")) {
                return false;
            }
        }
        return true;
    }

    /**
     * builds and returns an ArrayList of String objects that are values pulled from
     * the dictionary/database based on the available letters in the user's tile
     * rack
     */
    public ArrayList<String> getPlaylist() {
        ArrayList<String> valid = new ArrayList<>();
        try{
            try (Scanner file = new Scanner(new File("dictionary/2019_collins_scrabble.txt"))) { String next; while (file.hasNextLine()) {
                    next = file.nextLine().toUpperCase();
                    if (next.length() <= tileRack.size()) {
                        if (isValid(next)) {
                            valid.add(next + ((next.length() == tileRack.size()) ? "*" : ""));
                        }
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return valid;
    }

    /** displays the contents of the player's tile rack */
    public void printRack() {
        getPlaylist();
        System.out.println("The letters in your rack are: " + tileRack);
        System.out.println("You can play these words: ");
    }

    /** print all playable words based on the letters in the tile rack
     * BB helped with this too
     */
    public void printMatches() {
        ArrayList<String> Playlist = getPlaylist();
        printerHelper(Playlist);
        System.out.println("\n* means the word is a BINGO");
    }
    /**
     * Printer helper method * Added because of the sheer number of different versions of this document I have in my project.
     */
    static void printerHelper(ArrayList<String> playlist) {
        String word;
        for (int i = 0; i < playlist.size(); i++) {
            word = playlist.get(i);
            String x = word.length() == 7 ? word + "*" : word;
            if (i % 10 == 9) {
                System.out.println(x);
            } else {
                System.out.printf("%-10s", x);
            }
        }
    }

    /** main method for the class; use only 3 command lines in main.
     * @param args command line arguments.
     */
    public static void main(String[] args){
        ScrabbleRackManagerPermutations app = new ScrabbleRackManagerPermutations();
        app.printRack();
        app.printMatches();
    }
}
