package Homework.Chapter10;

public class Disk {
    private Point center;
    private double radius;

    public Disk(Disk d){
        this.center = d.center;
        this.radius = d.radius;
    }
}
