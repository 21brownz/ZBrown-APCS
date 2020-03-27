package Assesment;

public class Test5 {

    public int count = 0;

    public static boolean isFine(String str){
        return str.length() < 2 || (str.charAt(0) < str.charAt(1) && isFine(str.substring(1)));
    }

    public int factorial(int n){
        int product = 1;
        if(n > 1){
            product = n*factorial(n-1);
        }
        return product;
    }

    public int someFunOne(int n){
        if(n <= 0){
            return 2;
        }else{
            int x = someFunOne(n -1);
            return x * x;
        }
    }

    public int someFunTwo(int n){
        if(n <= 0){
            return 2;
        }else{
            count++;
            return someFunTwo(n-1) * someFunTwo(n-1);
        }
    }

    public static String process(String s){
        int n = s.length();
        if(n < 2){
            return s;
        }else{
            return s.charAt(n-1) + process(s.substring(1, n-1)) + s.charAt(0);
        }
    }


    public static void main(String[] args) {
        Test5 app = new Test5();
        System.out.println(isFine("rts"));
        System.out.println(isFine("sr"));
        System.out.println(isFine("rst"));
        System.out.println(isFine("srs"));
        System.out.println(isFine("str"));
        System.out.println(app.someFunTwo(5));
        System.out.println(app.count);
        app.count = 0;
        System.out.println(process("hello"));
    }
}
