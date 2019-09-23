package Unit1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Parameterized JUnit test for RomanToDecimal.
 * NOTE: Probably requires JUnit 5.
 * @author 21brownz
 * @version 1.1.2
 */
class RomanToDecimalTestParameterized{

    /**
     * The Class being tested
     */
    RomanToDecimal testingClass;

    /**
     * Sets up the test
     */
    @BeforeEach
    void setUp() {
        testingClass = new RomanToDecimal();
    }

    /**
     * Tests Roman to Decimal
     *
     * @param roman the roman
     * @param expected the expected
     */
    @ParameterizedTest
    @CsvFileSource(resources = "/Unit1/junit_parameters.csv", numLinesToSkip = 1)
    void testRomanToDecimal(String roman, int expected) {
        assertEquals(expected, RomanToDecimal.romanToDecimal(roman.toUpperCase()));
    }
}