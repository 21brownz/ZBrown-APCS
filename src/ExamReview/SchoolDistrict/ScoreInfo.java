package ExamReview.SchoolDistrict;

public class ScoreInfo {
    private int score;
    private int numStudents;

    /**
     * Constructor
     * @param ascore constructor score
     */
    public ScoreInfo(int ascore){
        this.score = ascore;
        numStudents = 1;
    }

    /**
     * adds 1 to the number of students who earned this score
     */
    public void increment(){
        numStudents++;
    }

    /**
     * @return this score
     */
    public int getScore(){
        return score;
    }

    /**
     * @return the number of students who earned this score
     */
    public int getFrequency(){
        return numStudents;
    }
}
