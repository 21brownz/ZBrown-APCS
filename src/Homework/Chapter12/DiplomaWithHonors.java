package Homework.Chapter12;

public class DiplomaWithHonors extends Diploma {
    String name;
    String subject;
    public DiplomaWithHonors(String name, String m) {
        super(name, m);
    }
    public String toString(){
        return super.toString() + "\n *** with honors *** ";
    }
}
