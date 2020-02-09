package Unit5.CoinSorter;
/**
 * A class of Coin defining a Nickel
 */
public class Nickel extends Coin {
    @Override
    public double getValue() {
        return 0.05;
    }

    @Override
    public String getName() {
        return "nickel";
    }
}
