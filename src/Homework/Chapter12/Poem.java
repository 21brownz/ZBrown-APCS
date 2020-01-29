package Homework.Chapter12;

public abstract class Poem {

    public abstract int numLines();

    public abstract int getSyllables(int k);

    public void printRhythm() {
        for (int i = 1; i <= numLines(); i++) {
            for (int j = 1; j <= getSyllables(i) - 1; j++) {
                System.out.print("ta-");
            }
            System.out.print("ta");
            System.out.println();
        }
    }
}
