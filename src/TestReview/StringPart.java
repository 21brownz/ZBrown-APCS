package TestReview;

public class StringPart {
    private int start;
    private int length;

    // Assigns the object in the natural way.
    public StringPart(int s, int l) {
        start = s;
        length = l;
    }

    // Accessor methods.
    public int getStart() {
        return start;
    }

    public int getLength() {
        return length;
    }

    // Not necessary, but useful to check if everything's working properly.
    public String toString() {
        return "("+start+","+length+")";
    }
}
