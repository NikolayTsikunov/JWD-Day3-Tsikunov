package by.tsikunov.day3.parser;

import by.tsikunov.day3.enumerator.Color;
import by.tsikunov.day3.exception.ProgramException;
import org.testng.annotations.Test;

public class ParseTest {

    @Test
    public void parseBasketDataTest() {
        Parser parser = new Parser();
        try {
            parser.parseBasketData("100 100");
        } catch (ProgramException e) {
            System.out.println(e.getMessage());
        }
    }

}
