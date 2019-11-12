package Unit3;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DecimalFormat;

public class ISBNGenerator {
    public static void main(String[] args) {
        ISBNGenerator isbnGenerator = new ISBNGenerator();
        isbnGenerator.writeISBN(50,"isbnfiles/booleancochran.dat");
    }

    public String generateNewISBN(){
        //decimal formats for the numbers in the ISBN
        DecimalFormat threedecimal = new DecimalFormat("000");
        DecimalFormat onedecimal = new DecimalFormat("0");
        DecimalFormat sixdecimal = new DecimalFormat("000000");
        DecimalFormat twodecimal = new DecimalFormat("00");
        //generates first chunk of the ISBN
        int max1 = 999;
        int min1 = 0;
        int range1 = max1 - min1 + 1;
        int random1 = (int) (Math.random() * range1) + min1;
        //generates second chunk of the ISBN
        int max2 = 9;
        int min2 = 0;
        int range2 = max2 - min2 + 1;
        int random2 = (int) (Math.random() * range2) + min2;
        //generates third chunk of the ISBN
        int max3 = 99;
        int min3 = 0;
        int range3 = max3 - min3 + 1;
        int random3 = (int) (Math.random() * range3) + min3;
        //generates fourth chunk of the ISBN
        int max4 = 999999;
        int min4 = 0;
        int range4 = max4 - min4 + 1;
        int random4 = (int) (Math.random() * range4) + min4;
        //generates fifth chunk of the ISBN
        int max5 = 9;
        int min5 = 0;
        int range5 = max5 - min5 + 1;
        int random5 = (int) (Math.random() * range5) + min5;

        return threedecimal.format(random1) + "-" + onedecimal.format(random2) + "-" + twodecimal.format(random3) + "-" + sixdecimal.format(random4) + "-" + onedecimal.format(random5);
    }
    public void writeISBN(int quantity, String path){
        try {
            PrintStream ps = new PrintStream(path);
            int i = 0;
            ISBNGenerator isbnGenerator = new ISBNGenerator();
            while(i < quantity){
                ps.println(isbnGenerator.generateNewISBN());
                System.out.println(isbnGenerator.generateNewISBN());
                i++;
            }
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
