package Unit5.CoinSorter;

/**
 * A class of Coin defining a Quarter
 */
public class Quarter extends Coin {
    @Override
    public double getValue() {
        return 0.25;
    }

    @Override
    public String getName() {
        return "quarter";
    }
}
