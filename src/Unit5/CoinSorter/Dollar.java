package Unit5.CoinSorter;

/**
 * A class of Coin defining a Dollar
 */
public class Dollar extends Coin {
    @Override
    public double getValue() {
        return 1.0;
    }

    @Override
    public String getName() {
        return "dollar";
    }
}
