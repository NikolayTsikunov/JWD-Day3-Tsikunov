package by.tsikunov.day3.reader;

import by.tsikunov.day3.exception.ProgramException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class ReaderTest {

    private final List<String> linesExpected = new ArrayList<>();

    @BeforeTest
    private void fillData() {
        linesExpected.add("5 6 RED");
        linesExpected.add("12 9 BLUE");
        linesExpected.add("12 9 BLUE");
        linesExpected.add("9 8 WHITE");
        linesExpected.add("5 6 BLACK");
        linesExpected.add("12 9 BLUE");
    }

    @Test
    public void readFromFileTest() {
        String filePath = "src/main/resources/balls";
        Reader reader = new Reader();
        try {
            List<String> linesActual = reader.readFromFile(filePath);
            assertEquals(linesActual, linesExpected, "Error!");
        } catch (Exception e) {
            fail("Unexpected exception!");
        }
    }

    @Test(expectedExceptions = ProgramException.class,
        expectedExceptionsMessageRegExp = "Can't find file")
    public void readFromFileTestException() throws ProgramException {
        Reader reader = new Reader();
        reader.readFromFile("src/main/resources/bal");
    }
}