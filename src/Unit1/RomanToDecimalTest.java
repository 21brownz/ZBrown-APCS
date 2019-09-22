package Unit1;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class RomanToDecimalTest {
    String file = "junit_parameters.csv";

    public static void main(String[] args) throws IOException {
        RomanToDecimalTest romanToDecimalTest = new RomanToDecimalTest();
        romanToDecimalTest.testRomanToDecimal();
    }

    public void testRomanToDecimal() throws IOException {
        FileReader fileReader = new FileReader();
        BufferedReader csvReader;
        csvReader = new BufferedReader(new java.io.FileReader(fileReader.loadfile(file)));
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            for (int i = 0; i < data.length; i++) {
            }
            csvReader.close();
        }

    }
}