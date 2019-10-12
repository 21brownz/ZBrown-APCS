package Unit1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.lang.Integer.parseInt;

@RunWith(Parameterized.class)
public class RomanToDecimalTest4 {

    @Parameterized.Parameters
    public static Collection<Object[]> data() throws IOException {
        String filePath = new File("src/Unit1/junit_parameters.csv").getAbsolutePath();
        BufferedReader csvReader = new BufferedReader(new FileReader(filePath));
        String row;
        int i = 0; //line count of csv
        Object[][] data = new Object[0][];//csv data line count=0 initially
        while ((row = csvReader.readLine()) != null) {
            ++i;//increment the line count when new line found
            Object[][] newdata = new Object[i][2];//create new array for data
            Object strar[] = row.split(",");//get contents of line as an array
            newdata[i - 1] = strar;//add new line to the array
            System.arraycopy(data, 0, newdata, 0, i - 1);//copy previously read values to new array
            data = newdata;//set new array as csv data
        }
        csvReader.close();
        return Arrays.asList(data);
    }
    private final String roman;
    private final int expected;

    public RomanToDecimalTest4(RomanToDecimal romanToDecimal, String roman, int decimal) {
        this.roman = roman;
        this.expected = decimal;
    }

    @Test
    public void TestRomanToDecimal() {
        Assert.assertEquals(parseInt(String.valueOf(expected)), RomanToDecimal.romanToDecimal(roman));
    }
}
