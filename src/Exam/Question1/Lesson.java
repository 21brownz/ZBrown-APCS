package Exam.Question1;

public class Lesson {

    private String type;
    private double cost;
    private boolean regEarly;

    /**
     * getter for the type parameter
     * @return type of class
     */
    public String getType(){
        return type;
    }

    /**
     * getter for the cost parameter
     * @return the cost
     */
    public double getCost(){
        return cost;
    }

    /**
     * setter for the cost parameter
     * @param cost the cost of the class
     */
    public void setCost(double cost){
        this.cost = cost;
    }

    /**
     * getter for the isRegEarly parameter
     * @return isRegEarly
     */
    public boolean isRegEarly(){
        return regEarly;
    }

}
