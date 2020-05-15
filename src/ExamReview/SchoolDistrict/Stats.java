package ExamReview.SchoolDistrict;

import java.util.ArrayList;

public class Stats {
    private ArrayList<ScoreInfo> scoreList;
    // listed in increasing score order; no two ScoreInfo objects contain the same score

    /**
     * records a score in the database, keeping the database in increasing score order.
     * if no other ScoreInfo object represents score, a new ScoreInfo object representing score
     * is added to the database; otherwise, the frequency in the ScoreInfo object representing score is incremented.
     * @param stuScores a score to be recorded in the list
     * @return true if a new ScoreInfo object representing score was added to the list; false otherwise
     */
    public boolean recordScores(int stuScores) {
        for (int i = 0; i < scoreList.size(); i++) {
            if(scoreList.get(i).getScore() == stuScores){
                scoreList.get(i).increment();
                return true;
            }
        }
        for (int i = 1; i <scoreList.size(); i++) {
            if(scoreList.get(i-1).getScore() < stuScores){
                scoreList.add(i, new ScoreInfo(stuScores));
            }
        }
        return false;
    }
}
