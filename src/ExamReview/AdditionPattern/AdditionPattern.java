package ExamReview.AdditionPattern;

public class AdditionPattern {

    private int current;
    private int start;
    private int increment;

    public AdditionPattern(int start, int val){
        this.increment = val;
        this.start = start;
        current = start;
    }

    public int currentNumber(){
        return current;
    }

    public void next(){
        current += increment;
    }

    public void prev(){
        if(current != start){
            current -= increment;
        }
    }
}
