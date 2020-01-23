package Homework.Chapter10;

public class Puzzle {
    private String message = "Hello there. General Kenobi, what a pleasant surprise.";

    public void hello(){
        System.out.println(message);
    }

    public static void main(String[] args) {
        Puzzle puzzle = new Puzzle();
        puzzle.hello();
    }
}
