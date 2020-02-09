package Unit5.CoinSorter;
/**
 * A class of Coin defining a Penny
 */
public class Penny extends Coin {
    @Override
    public double getValue() {
        return 0.01;
    }

    @Override
    public String getName() {
        return "penny";
    }
}
