package Homework.Chapter12;

public class Limerick extends Poem {
    @Override
    public int numLines() {
        return 5;
    }

    @Override
    public int getSyllables(int k) {
        if (k == 1 || k == 2 || k == 5) {
            return 9;
        } else if (k == 3 || k == 4) {
            return 6;
        }
        return -1;
    }
}
