package Exam.Question1;

import java.util.ArrayList;

public class MusicSchool {
    /**
     * A list containing information about lessons signed up for at the school
     * Guaranteed not to be null and to contain only non-null entries
     */
    private ArrayList<Lesson> lessonList;

    /**
     * Updates the cost for all lessons, as described in part (a)
     */
    public void updateCosts(double piano, double voice, double reg){
        //iterate through lessonList
        for (Lesson lesson : lessonList) {
            //establish cost variable to please the poor grader of this question. I would have put this locally within the setCost of the update if statement, but that would make it harder to read.
            double cost = lesson.getCost();
            if (lesson.getType().equals("piano")) {
                //update the cost of a piano lesson. (Piano isn't cheap!)
                lesson.setCost(cost + piano);
            } else if (lesson.getType().equals("voice")) {
                //update the cost of a voice lesson. (Neither is singing.)
                lesson.setCost(cost + voice);
            } else {
                //update the cost of any other type of lesson (I'm a guitar guy myself.)
                lesson.setCost(cost + reg);
            }
        }
        //TODO: make method establish world dominance.
    }
    /**
     * Updates the cost of a randomly selected piano lesson by a give discount and returns the updated cost, as described in part (b)
     * Precondition: At least one lesson meets the eligibility requirements and the discount is less than the cost of the lesson.
     */
    public double getDiscountedLessonCost(double discount){
        ArrayList<Integer> eligibleLessons = new ArrayList<>();
        //iterate through all lessons in lessonList to find eligible lessons, and throw their indexes in a list.
        for(int i = 0; i < lessonList.size(); i++){
            if (lessonList.get(i).getType().equals("piano") && lessonList.get(i).isRegEarly()){
                eligibleLessons.add(i);
            }
        }
        //generate a random number that is between the 0 and the length of eligibleLessons.
        // Using a ThreadRandom object would be the best way to implement this but I don't know if it is within the College Board API list.
        int winnerWinnerChickenDinner = (int)(Math.random() * eligibleLessons.size());
        //gets the previous cost of the winning lesson
        double prevcost = lessonList.get(winnerWinnerChickenDinner).getCost();
        //updates the cost of the winning lesson
        lessonList.get(winnerWinnerChickenDinner).setCost(prevcost - discount);
        //returns updated cost.
        return prevcost - discount;
    //TODO: add funny todo joke.
    }

    /*
    Part C: the programmer would like to add a method called getInstructorWithMostLessons, which returns the name of the
    instructor who is currently teaching the most lessons.
    Write a description of how you would change the Lesson and MusicSchool classes in order to support this modification.
     */

    //method header for part C
    public String getInstructorWithMostLessons(){
        //TODO: implement in the next APCS A exam I take ;)
        return "Thanks for a great year Mr. Cochran";
    }
    /*
    The Lesson class would have to be modified to include a private String parameter called instructor that stored the name of the instructor of that lesson.
    The constructor of the lesson class would also have to be modified to accept a String called instructor in its parameters.
    There are other ways to implement this like creating a new class called Instructor, which would have the name of the professor
    and a list of lessons as its parameters and local variables, but this would be wholly unnecessary given the scope of the method,
    although it would greatly reduce the length of the method and simplify future integration of methods that need to know information about the instructors.
     */
}
