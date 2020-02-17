package Homework.Chapter13;

public class Chapter13 {
    //Problem 1
    public int multiply(int a, int b){
        return (b>0)? a + multiply(a,b-1) : 0;
    }

    //Problem 2
    public int mysterySum(int n){
        return n == 0 ? 0 : 3 + mysterySum(n - 1);
    }

    //problem 3
    public String process(String str){
        String s = str;
        int n = s.length();
        if( n >= 2){
            int n2 = n/2;
            s = process(s.substring(n2))+ process(s.substring(0,n2));
        }
        return s;
    }

    public boolean isGood(String s){
        int n = s.length();
        return n < 2 || (s.charAt(0) == s.charAt(n-1) && isGood(s.substring(1,n-1)));
    }
    
    public static void printStars(int n) {
        if (n < 1){
            return;
        }
        System.out.print( "*");
        printStars(n - 1);
    }
    static void printTriangle(int n) {
        if (n < 1) {
            return;
        }
        printTriangle(n - 1);
        System.out.println();
        printStars(n);
    }

    public void enigma(int n){
        for (int i = 0; i < n; i++) {
            enigma(i);
        }
        System.out.print(n);
    }

    public int factorial(int n){
        return n == 1 ? 1 : n * factorial(n - 1);
    }

    public int sumDigits(int n){
        return n == 0 ? 0 : n % 10 + sumDigits(n / 10);
    }

    public boolean divisibleByThree(int n){
        return (n == 3 || n == 6 || n == 9) || divisibleByThree(sumDigits(n));
    }

    public void printX(int n){
        if(n <= 0){
            System.out.println(0);
        }else{
            printX(n-1);
            System.out.print(n);
            printX(n-2);
        }
    }
    public static void main(String[] args) {
        Chapter13 c13 = new Chapter13();
        System.out.println(c13.process("HAVE") + " " + c13.process("FUN"));
        c13.printX(3);
    }
}
