package by.tsikunov.day3.parser;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ParserTest {

    @Test
    public void parseBasketDataTest() {
        Parser parser = new Parser();
        String data = "100 100";
        double[] expected = {100, 100};
        double[] actual = parser.parseBasketData(data);
        assertEquals(actual, expected, "It isn't work!");
    }

    @Test
    public void parseBallDataTest() {
        Parser parser = new Parser();
        String data = "12 5 RED";
        double[] expected = {12, 5, 0};
        double[] actual = parser.parseBallData(data);
        assertEquals(actual, expected, "It isn't work!");
    }
}