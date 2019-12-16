package TestReview;

import java.util.ArrayList;

public class TestThree {
    String[] usedWords = {"music", "musical", "musically", "meditation", "pineapple"};

    public void problemThirteen(){
        ArrayList<String> animals = new ArrayList<>();
        animals.add("fox");
        animals.add(0, "squirrel");
        animals.add("deer");
        String byeBye = animals.set(2, "groundhog");
        animals.add(1, "mouse");
        System.out.println(animals.get(2) + " and " + animals.get(3) + " are better than " +  byeBye);
    }

    /** Counts how many strings in wordArray are not found in usedWords
     *  @param wordArray an array of Strings
     *  @return an integer representing the number of Strings in wordArray
     *  not found in usedWords
     */
    public int countNotInWordBank(String[] wordArray)	{
        int count = 0;
        for (String word : usedWords) {
            boolean found = false;
            for (String test : wordArray) {
                if (!word.equals(test)) {
                    found = true;
                    break;
                }
            }
            if(!found)
                count++;
        }
        return count;
    }

    public static boolean mysteryMethod(int[] a)	{
        int i = 1;
        while(i < 10 && i < a.length && a[i] >= a[i-1])
            i++;
        return i >= 10;
    }

    /** Returns an array containing strings from wordArray not found in
     *  usedWords
     *  When writing notInVocab, you should call the countNotInWordBank
     *  method and have it work as expected, regardless of what you wrote to
     *  define that method.
     *  @param wordArray, an array of String objects
     *  @return a String array of all the words in wordArray not found in
     *  usedWords
     */
    public String[] notInVocab(String[] wordArray)	{
        String[] notFounds = new String[countNotInWordBank(wordArray)];
        return notFounds;
    }



    public static void main(String[] args) {
        TestThree testThree = new TestThree();
        testThree.problemThirteen();
        System.out.println(mysteryMethod(new int[]{1,2,1,3,2,4,3,5,4,6,5,7,6,8,9,10}));
    }
}