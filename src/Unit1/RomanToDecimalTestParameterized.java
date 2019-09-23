package Unit1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

class RomanToDecimalTestParameterized{

    RomanToDecimal classUnderTest;

    @BeforeEach
    void setUp() {
        classUnderTest = new RomanToDecimal();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/Unit1/junit_parameters.csv", numLinesToSkip = 1)
    void testGetPrice(String roman, int expected) {
        assertEquals(expected, RomanToDecimal.romanToDecimal(roman.toUpperCase()));
    }
}