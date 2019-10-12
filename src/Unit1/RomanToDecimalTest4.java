package Unit1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RomanToDecimalTest4 {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0, 0 }, { 1, 1, 2 }
        });
    }

    private final String roman;
    private final int expectedSum;

    public RomanToDecimalTest4(RomanToDecimal romanToDecimal, String roman, int decimal) {
        this.roman = roman;
        this.expectedSum = decimal;
    }

    @Test
    public void TestRomanToDecimal() {
        int toDecimal = RomanToDecimal.romanToDecimal();
        Assert.assertEquals();
    }
}
