package Unit2;

import java.util.Random;

public class chapter6 {

    public static int max(int x, int y, int z){
        return Math.max(Math.max(x , y), z);
    }

    public double wages(double hours, double rate){
        double wages;
        if (hours > 40){
            wages = 40 * rate + (hours-40)*rate;
        }else{
            wages = hours * rate;
        }
        return wages;
    }

    public boolean geometricSequence(int a, int b, int c){
        return a != 0 && b != 0 && c != 0 && b*b == a*c;
    }

    public static void main(String[] args) {
        boolean a;
        boolean b;
        Random rd = new Random();
        a = rd.nextBoolean();
        b = rd.nextBoolean();
        System.out.println(!(a || !b));
    }
    public void grademath(int avg){
        char grade;
        if(avg >= 90)
            grade = 'a';
        else if (avg >= 80)
            grade = 'b';
        else if(avg >= 70)
            grade = 'c';
        else if(avg >= 60)
            grade = 'd';
        else
            grade = 'f';

        if(avg < 60){
            grade = 'f';
        }else if(avg > 60 && avg < 70){
            grade = 'd';
        }else if(avg > 70 && avg < 80){
            grade = 'c';
        }else if(avg > 80 && avg < 90){
            grade = 'b';
        }else if(avg > 90 && avg < 100){
            grade = 'a';
        }
    }
}
