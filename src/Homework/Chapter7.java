import java.util.Scanner;

public class Chapter7 {
    public int product(int a, int b) {
        int p = 0;
        for (int i = 0; i < b; i++) {
            p += a;
        }
        return p;
    }
    public void PrintQuotient(int m, int n){
        int quotient = 0;
        int remainder = 0;
        while(m >= n){
            quotient++;
            m-=n;
        }
        System.out.println("Quotient: " +quotient+ "Remainder: " +m);
    }
    public double holaMexico(){
        Scanner scan = new Scanner(System.in);
        int year = 2014;
        final double START_POP = 123.8;
        final double GROWTH_RATE = 0.005;
        System.out.print("Please input the target population: ");
        double target = scan.nextDouble();
        double population = START_POP;
        while(population < target){
            population += (population * GROWTH_RATE);
            year++;
        }
        return year;
    }
    public double totalWages(double hours, double wage){
        if(hours <= 40){
            return hours*wage;
        }else{
            return 40*wage+((hours-40)*wage*1.5);
        }
    }
    public static int kevin(){
        double knowledge = 0;
        int months = 0;
        while(knowledge < 0.95){
            knowledge += (1 - knowledge) * 0.1;
            months++;
        }
        return months;
    }
    public static int sumDigits(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void printCheckerboard(int n){
        for (int i = 0; i <n; i++) {
            String booleancochran = "";
            for (int j = 0; j <n; j++) {
                booleancochran += ((i+j)%2==0)? "#" : "o";
            }
            System.out.println(booleancochran);
        }
    }
}

