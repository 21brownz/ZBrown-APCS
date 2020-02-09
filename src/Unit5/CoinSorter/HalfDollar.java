package Unit5.CoinSorter;
/**
 * A class of Coin defining a Half Dollar
 */
public class HalfDollar extends Coin{
    @Override
    public double getValue() {
        return 0.5;
    }

    @Override
    public String getName() {
        return "half dollar";
    }
}
