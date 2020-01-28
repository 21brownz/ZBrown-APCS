package Homework.Chapter12;

public class Diploma {
    String name;
    String subject;
    public Diploma(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    public String toString(){
        return "This certifies that " + name + "\n has completed a MOOC in " + subject;
    }
}
