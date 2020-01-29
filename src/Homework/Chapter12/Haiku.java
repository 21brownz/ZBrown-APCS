package Homework.Chapter12;

public class Haiku extends Poem {
    @Override
    public int numLines() {
        return 3;
    }

    @Override
    public int getSyllables(int k) {
        if(k == 1 || k == 3){
            return 5;
        }else if(k == 2){
            return 7;
        }
    return -1;
    }
}
