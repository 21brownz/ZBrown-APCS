package Homework.Chapter10;
    //10 a) Write a class Rectangle that represents a rectangle with integer width and height.
    // Include a constructor that builds a rectangle with a given width and height and another
    // constructor (with one parameter) that builds a rectangle that is actually a square of a given size.
    // Make sure these constructors check that the width and height are positive. Add a constructor that takes no
    // parameters and builds a square of size 1.
public class Rectangle {
    int width, height;
    public Rectangle(int w, int h){
        this.height = h;
        this.width = w;
    }
    public Rectangle(int s){
        this.width = s;
        this.height = s;
    }
    public Rectangle(){
        this.height = 1;
        this.width = 1;
    }
}
