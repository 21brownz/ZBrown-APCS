package Unit5;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class ScrabbleRackManager {
    private ArrayList<String> tileRack;
    private ArrayList<String> database;
    /**
     * class constructor
     */
    public ScrabbleRackManager(){
        tileRack = new ArrayList<>(); //the rack
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //the alphabet
        int[] frequencies = {9, 2, 2, 4, 12, 2, 3, 2, 9, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1}; //the frequency of each letter in the scrabble bag
        ArrayList<String> allTiles = new ArrayList<>();
        int index = 0;
        for(int count : frequencies){
            for (int i = 0; i < count; i++) {
                allTiles.add(alpha.substring(index,index +1));
            }
            index++;
        }
        Collections.shuffle(allTiles); //first randomization
        for (int i = 0; i < 7; i++) {
            tileRack.add(allTiles.remove((int)(Math.random()*allTiles.size()))); //double randomization
        }
        database = new ArrayList<>();

        try{
            Scanner in = new Scanner(new File("dictionary/2019_collins_scrabble.txt"));
            while(in.hasNext()){
                database.add(in.nextLine());
            }
            in.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * displays the contents of the player's tile rack
     */
    public void printRack(){
        System.out.println(tileRack);
    }

    private int countMatches(String f, char l){
        int count = 0;
        for (int i = 0; i < f.length(); i++) {
            if (f.charAt(i) == l) {
                count++;
            }
        }
        return count;
    }
    public String convertString(ArrayList<String> a) {
    String s = "";
        for (int i = 0; i <a.size(); i++) {
            s += a.get(i);
        }
        return s;
    }


        /**
         * builds and returns an ArrayList of String objects that are values pulled from
         * the dictionary/database based on the available letters in the user's tile
         * rack
         */
    public ArrayList<String> getPlaylist(){
        ArrayList<String> playList = new ArrayList<>();
        String word = convertString(tileRack);
        for (String s : database) {
            TreeMap<Character, Integer> freq = new TreeMap<>();
            for (int j = 0; j < s.length(); j++)
                freq.put(s.charAt(j), 0);
            for (int j = 0; j < word.length(); j++) {
                if (freq.containsKey(word.charAt(j)))
                    freq.put(word.charAt(j), freq.get(word.charAt(j)) + 1);
            }
            boolean match = true;
            for (int count : freq.values()) {
                if (count <= 0) {
                    match = false;
                    break;
                }
            }
            if (match)
                playList.add(s);
        }
        Collections.sort(playList);
        // "[A, G, H, J]" == "AGHJ"
//        //handler for removing words with more letters than available
//        ArrayList<String> wordstoremove = new ArrayList<>();
//        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//        String letterRack = convertString(tileRack);
//        for (int i = 0; i < playList.size() ; i++) {
//            String play = playList.get(i);
//            int[] lettercount = new int[26];
//            int[] lettercountrack = new int[26];
//            for (int j = 0; j < alphabet.length; j++) {
//                lettercount[j] = countMatches(play, alphabet[j]);
//            }
//            for (int j = 0; j < tileRack.size(); j++) {
//                lettercountrack[i] = countMatches(letterRack, alphabet[j]);
//            }
//            if(lettercountrack != lettercount){ wordstoremove.add(playList.get(i));}
//        }
        return playList;
    }

    /**
     * print all playable words based on the letters in the tile rack. Got help from Griffin for this.
     */
    public void printMatches(){
        ArrayList<String> Playlist = getPlaylist();
        String word;
        for (int i = 0; i <Playlist.size(); i++) {
            word = Playlist.get(i);
            String x = word.length() == 7 ? word + "*" : word;
            if (i % 10 == 9) {
                System.out.println(x);
            } else {
                System.out.printf("%-10s", x);
            }
        }
    }

    /** main method for the class; use only 3 command lines in main */
    public static void main(String[] args){
        ScrabbleRackManager app = new ScrabbleRackManager();
        app.printRack();
        app.printMatches();
    }
}

/*
┌───────────────────────────────────────────┐
│      ____              __                 │
│     / __ )____  ____  / /__  ____ _____   │
│    / __  / __ \/ __ \/ / _ \/ __ `/ __ \  │
│   / /_/ / /_/ / /_/ / /  __/ /_/ / / / /  │
│  /_____/\____/\____/_/\___/\__,_/_/ /_/   │
│                                           │
│    ______           __                    │
│   / ____/___  _____/ /_  _________ _____  │
│  / /   / __ \/ ___/ __ \/ ___/ __ `/ __ \ │
│ / /___/ /_/ / /__/ / / / /  / /_/ / / / / │
│ \____/\____/\___/_/ /_/_/   \__,_/_/ /_/  │
│                                           │
└───────────────────────────────────────────┘
 */