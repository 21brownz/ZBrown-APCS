package Unit5.CoinSorter;

/**
 * defines Coin class and its methods
 * @author 21brownz
 * @version 2/2/20
 */
public abstract class Coin {
    /**
     * retrieves the value of the coin
     * @return value of the coin
     */
    public abstract double getValue();

    /**
     * gets the name of the coin
     * @return name of the coin
     */
    public abstract String getName();

    /**
     * gives the plural name of the coin
     * @return the plural name of the coin
     */
    public String getPluralName(){
        return getName().substring(getName().length() - 1).equals("y") ? "pennies" : getName() + "s";
    }
}
