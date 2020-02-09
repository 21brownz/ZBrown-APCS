package Unit5.CoinSorter;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * a class that sorts coins from a user given file
 * @author 21brownz
 * @version 2/2/20
 */
public class CoinSorterMachine { //TODO: write in lolcode
    private ArrayList<Coin> coins;
    private String[] names;
    private int[] count;
    private double[] value;

    /**
     * constructor for the class
     * initializes arraylist and count and value arrays
     * Ben told me to use arrays instead of arraylists, easier that way
     */
    public CoinSorterMachine(){
        coins = new ArrayList<>();
        names = new String[]{"pennies", "nickels", "dimes", "quarters", "half dollars", "dollars"};
        count = new int[6];
        value = new double[6];
    }

    /**
     * deposits the coins from the user-provided file into the arraylist Coins
     */
    public void depositCoins(){
        Scanner user = new Scanner(System.in);
        System.out.print("Enter the name of the data file for coin deposit: ");
        try {
            Scanner fileScan = new Scanner(new File("coins/" + user.nextLine())); //should probably have used BufferedReader
            System.out.println("Depositing coins...");
            while (fileScan.hasNextLine()) {
                String s = fileScan.nextLine();
                if ("1".equals(s)) {  // switches are for suckers.
                    coins.add(new Penny());
                } else if ("5".equals(s)) {
                    coins.add(new Nickel());
                } else if ("10".equals(s)) {
                    coins.add(new Dime());
                } else if ("25".equals(s)) {
                    coins.add(new Quarter());
                } else if ("50".equals(s)) {
                    coins.add(new HalfDollar());
                } else if ("100".equals(s)) {
                    coins.add(new Dollar());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Coin coin : coins) {
            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(coin.getPluralName())) {
                    count[i]++;
                    value[i] += coin.getValue();
                    break;
                }
            }
        }

    }

    /**
     * prints the summary of the deposited coins
     * Ben helped with the printf styling here
     */
    public void printDepositSummary(){
        DecimalFormat f = new DecimalFormat("'$'###,###,##0.00");
        System.out.println("Summary of deposit: ");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("\t%d %s ", count[i], names[i]);
            System.out.println(f.format(value[i]));
        }
        System.out.println("TOTAL DEPOSIT: " + f.format(getTotalValue()));
    }

    /**
     * gives the total value of the coins in the Coins arraylist
     * @return the total value of Coins
     */
    public double getTotalValue(){
        double sum = 0;
        for (Coin c : coins)
            sum += c.getValue();
        return sum;
    }

    /**
     * the entry point of the application
     * @param args command line arguments
     */
    public static void main(String[] args){
        CoinSorterMachine app = new CoinSorterMachine();
        app.depositCoins();
        app.printDepositSummary();
    }
}

