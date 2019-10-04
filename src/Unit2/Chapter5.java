package Unit2;

public class Chapter5 {
    public static void main(String[] args) {
        //declaration means name and type of a variable
        //initialization means giving it a value
        int a = 10, b , c = 81, d = 91, e;
        int hours = 2; double pay = 12.75;
        //to initialize an object, call a new keyword
        String yourMom = "abracadabra";
        String yourMom2 = "abracadabra";
        System.out.println(yourMom == yourMom2);

        int max = 1000;
        int min = 60;
        int range = max - min + 1;
        int num = (int) (Math.random() * range) + min;

        int miles = 98, gallons = 5;
        double gasMileage = miles / gallons;
        System.out.println(gasMileage);
        }
    public static int swapOnesAndTens(int num) {
        int ones = num%10;
        num /= 10;
        int tens = num%100;
        num /= 10;
        return num*100 + ones*10 + tens;

    }
    }
