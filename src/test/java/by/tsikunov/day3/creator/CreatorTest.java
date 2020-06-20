package by.tsikunov.day3.creator;

import by.tsikunov.day3.entity.Ball;
import by.tsikunov.day3.entity.Basket;
import by.tsikunov.day3.enumerator.ProgramColor;
import by.tsikunov.day3.exception.ProgramException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class CreatorTest {

    private List<String> basketData = new ArrayList<>();
    private List<Basket> expectedBaskets = new ArrayList<>();

    private List<String> ballsData = new ArrayList<>();
    private List<Ball> expectedBalls = new ArrayList<>();

    private Creator creator = new Creator();

    @BeforeTest
    private void fillPrepareData() {
        basketData.add("100 100");
        basketData.add("150 150");

        expectedBaskets.add(new Basket(100, 100));
        expectedBaskets.add(new Basket(150, 150));

        ballsData.add("5 12 RED");
        ballsData.add("5 6 WHITE");
        ballsData.add("7 9 BLUE");

        expectedBalls.add(new Ball(5, 12, ProgramColor.RED.ordinal()));
        expectedBalls.add(new Ball(5, 6, ProgramColor.WHITE.ordinal()));
        expectedBalls.add(new Ball(7, 9, ProgramColor.BLUE.ordinal()));
    }


    @Test
    public void createBasketTest() {
        try {
            List<Basket> actualBaskets = creator.createBaskets(basketData);
            assertEquals(actualBaskets, expectedBaskets);
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }

    @Test
    public void createBasketTestNegative() {
        try {
            List<Basket> actualBaskets = creator.createBaskets(basketData);
            actualBaskets.add(new Basket(60, 70));
            assertNotEquals(actualBaskets, expectedBaskets);
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }

    @Test(expectedExceptions = ProgramException.class,
            expectedExceptionsMessageRegExp = "Empty baskets entry data!")
    public void createBasketTestException() throws ProgramException {
        creator.createBaskets(new ArrayList<>());
    }

    @Test
    public void createListBallsTest() {
        try {
            List<Ball> actualBalls = creator.createListBalls(ballsData);
            assertEquals(actualBalls, expectedBalls);
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }

    @Test
    public void createListBallsTestNegative() {
        try {
            List<Ball> actualBalls = creator.createListBalls(ballsData);
            actualBalls.add(new Ball(10, 10, ProgramColor.RED.ordinal()));
            assertNotEquals(actualBalls, expectedBalls);
        } catch (Exception e) {
            fail("Unexpected exception");
        }
    }

    @Test(expectedExceptions = ProgramException.class,
            expectedExceptionsMessageRegExp = "Empty balls entry data!")
    public void createListBallsTestException() throws ProgramException {
        creator.createListBalls(new ArrayList<>());
    }
}