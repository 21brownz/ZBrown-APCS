package Unit2;

import java.util.ArrayList;
import java.util.Arrays;

public class CTFchallenge {
    private String al;
    private ArrayList<String> als;
    private int points;

    public CTFchallenge()	{
        al = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        char c = (char)(32 % (int)(Math.pow(2, 6)));
        String [] chs = al.split(""+c);
        als = new ArrayList<String>(Arrays.asList(chs));
        als.add(""+c);
        points = 0;
    }
    public String question1analysis(String cipher) {
        String en = cipher.toUpperCase();
        int zz = -1;
        String hash = "";
        String bash = " 26 17 7 2 6 2 5 3 21 7 11 13 21 26 25 6 24 25 7 1 8";
        for (int i = 0; i < en.length(); i++) {
            zz = als.indexOf(en.substring(i, i + 1));
            hash += (zz == 26) ? zz + "" : (25 - zz) + "";
        }
        return hash;
    }

    public static void main(String[] args) {
        CTFchallenge ctFchallenge = new CTFchallenge();
        System.out.println(ctFchallenge.question2analysis("15 10 18 7 5 17 16 26 14 11 2 6 15 13 17 5 1 3 4 26 0 1 6"));
    }

public String question2analysis(String cipher){
    try	{
        String[] iCanHasItemz = cipher.toUpperCase().split(" ");
        String en = "";
        for(int x = 0; x < iCanHasItemz.length-1; x++)
            en += (iCanHasItemz[x] + " ");
        int shoop = Integer.parseInt(iCanHasItemz[iCanHasItemz.length-1]);
        int zz = -1;
        String hash = "";
        String bash = "15101875171626141126151317513426016";
        for(int i = 0; i < en.length()-1; i++) {
            zz = als.indexOf(en.substring(i, i + 1));
            hash += (zz == 26) ? zz + "" : ((zz + shoop) % 26) + "";
        }
        return hash;
    } catch (NumberFormatException e) {
        e.printStackTrace();
    }
return "";
}
}

