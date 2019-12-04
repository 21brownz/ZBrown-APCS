package Unit4;

import org.jetbrains.annotations.Contract;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class that finds and prints words containing other words. Implements WordFinder.
 * @author 21brownz
 * @version 12-3-19
 * @see Unit4.WordFinder
 */
public class SubWordFinder implements WordFinder {
    private ArrayList<ArrayList<String>> dictionary;
    private String alpha;

    /**
     * Instantiates a new Sub-word finder.
     */
    @Contract(pure = true)
    public SubWordFinder() {
        alpha = "abcdefghijklmnopqrstuvwxyz";
        dictionary = new ArrayList<>(26);
        for (int i = 0; i < 26; i++) {
            dictionary.add(new ArrayList<>());
        }
    }

    /**
     * Populates the Dictionary ArrayList with words from the file.
     */
    @Override
    public void populateDictionary() {
        Scanner in = null;
        try{
            in = new Scanner(new File("dictionary/words_all_os.txt"));
            String word;
            while(in.hasNext()){
                word = in.nextLine();
                dictionary.get(alpha.indexOf(word.charAt(0))).add(word);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * finds the subwords in the words in the dictionary
     * @return an arraylist of the sub-words found within the provided word.
     */
    @Override
    public ArrayList<SubWord> getSubWords() {
        String sub1, sub2;
        ArrayList<SubWord> subWords = new ArrayList<>();
        for(ArrayList<String> bucket : dictionary){
            for(String word: bucket){
                for(int i = 2; i < word.length()-2; i++){
                    sub1 = word.substring(0,i);
                    sub2 = word.substring(i);
                    if(inDictionary(sub1)&&inDictionary(sub2)){
                        subWords.add(new SubWord(word, sub1, sub2));
                    }
                }
            }
        }
        return subWords;
    }

    /**
     * tests to see if the word is in the dictionary.
     * @param word The item to be searched for in the dictionary.
     * @return boolean whether the word is in the dictionary provided with the populateDictionary method.
     */
    @Override
    public boolean inDictionary(String word) {
        ArrayList<String> current = dictionary.get(alpha.indexOf(word.charAt(0)));
        int middle, left = 0, right = current.size()-1;
        while (left <= right) {
            middle = (left+right)/2;
            if (current.get(middle).compareTo(word) < 0) {
                left = middle + 1;
            } else if (current.get(middle).compareTo(word) > 0) {
                right = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * The entry point of SubWordFinder.
     * @param args the input CLAs.
     */
    public static void main(String[] args) {
        SubWordFinder swf = new SubWordFinder();
        swf.populateDictionary();
        ArrayList<SubWord> sws = swf.getSubWords();
        for (SubWord sw:sws) {
            System.out.println(sw);
        }
    }
}

//      __  __              ____              __                 __
//     / / / /__  __  __   / __ )____  ____  / /__  ____ _____  / /
//    / /_/ / _ \/ / / /  / __  / __ \/ __ \/ / _ \/ __ `/ __ \/ /
//   / __  /  __/ /_/ /  / /_/ / /_/ / /_/ / /  __/ /_/ / / / /_/
//  /_/ /_/\___/\__, /  /_____/\____/\____/_/\___/\__,_/_/ /_(_)
//             /____/
