package Unit5;

public abstract class Animal {
    //abstract classes can only contain private data
    // interfaces can only contain a list of methods -- all public
    private int numLegs;
    private boolean isFemale;
    private String color;

    public Animal(int l, boolean f, String c){
        this.numLegs = l;
        this.isFemale = f;
        this.color = c;
    }
    public Animal(Animal other){
        this.numLegs = other.numLegs;
        this.color = other.color;
        this.isFemale = other.isFemale;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public String getColor() {
        return color;
    }
    public abstract String speak();
}
