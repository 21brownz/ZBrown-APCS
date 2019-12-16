package FreeResponse;

import java.util.ArrayList;

/**
 * @author 21brownz
 */
public class StringCoder {

    private String masterString;

    /**
     * constructor
     * @param master master string
     */
    public StringCoder(String master) {
        masterString = master;
    }

    public String decodeString(ArrayList<StringPart> parts) {
        StringBuilder ans = new StringBuilder();
        for (StringPart part : parts){
            ans.append(masterString, part.getStart(), part.getStart() + part.getLength());
        }
        return ans.toString();
    }

    private StringPart findPart(String str) {
        int max = 0;
        int start = 0, len = 0;
        for (int i = 0; i < masterString.length(); i++) {
            int j = 0;
            int savei = i;
            while (savei < masterString.length() && j < str.length() && masterString.charAt(savei) == str.charAt(j)) {
                savei++;
                j++;
            }
            if (j > max) {
                start = savei - j;
                len = j;
                max = j;
            }
        }
        return new StringPart(start, len);
    }

    public ArrayList<StringPart> encodeString(String word) {
        String s = word;
        ArrayList<StringPart> ans = new ArrayList<>();
        while (s.length() > 0) {
            StringPart next = findPart(s);
            int len = next.getLength();
            s = s.substring(len);
            ans.add(next);
        }
        return ans;
    }

    public static void main(String[] args) {
        StringCoder s = new StringCoder("sixtyzipperswerequicklypickedfromthewovenjutebag");
        ArrayList<StringPart> theseparts = s.encodeString("overeager");
        for (StringPart thesepart : theseparts) {
            System.out.println(thesepart);
        }
        String answer = s.decodeString(theseparts);
        System.out.println("Decoded string is " + answer);
    }
}