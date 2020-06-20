package by.tsikunov.day3.service;

import by.tsikunov.day3.entity.Ball;
import by.tsikunov.day3.entity.Basket;
import by.tsikunov.day3.exception.ProgramException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static by.tsikunov.day3.enumerator.ProgramColor.*;
import static org.testng.Assert.*;

public class BasketServiceTest {

    private Basket filledBasket;
    private List<Ball> balls;

    @BeforeMethod
    private void fillData() {
        filledBasket = new Basket(100, 100);
        balls = new ArrayList<>();

        filledBasket.addBall(new Ball(5, 6, RED.ordinal()));
        filledBasket.addBall(new Ball(12, 9, BLUE.ordinal()));
        filledBasket.addBall(new Ball(12, 9, BLUE.ordinal()));
        filledBasket.addBall(new Ball(9, 8, WHITE.ordinal()));
        filledBasket.addBall(new Ball(5, 6, BLACK.ordinal()));
        filledBasket.addBall(new Ball(12, 9, BLUE.ordinal()));

        balls.add(new Ball(5, 6, RED.ordinal()));
        balls.add(new Ball(12, 9, BLUE.ordinal()));
        balls.add(new Ball(12, 9, BLUE.ordinal()));
        balls.add(new Ball(9, 8, WHITE.ordinal()));
        balls.add(new Ball(5, 6, BLACK.ordinal()));
        balls.add(new Ball(12, 9, BLUE.ordinal()));
    }

    @Test
    public void fillBasketTestTrue() {
        BasketService service = new BasketService();
        Basket basket = new Basket(100, 100);
        boolean isFill = service.fillBasket(basket, balls);
        assertTrue(isFill);
    }

    @Test
    public void fillBasketTestFunctionTestRemainingBalls() {
        BasketService service = new BasketService();
        Basket basket = new Basket(100, 100);
        service.fillBasket(basket, balls);
        assertTrue(balls.isEmpty());
    }

    @Test
    public void fillBasketTestBasket() {
        BasketService service = new BasketService();
        Basket basket = new Basket(100, 100);
        service.fillBasket(basket, balls);
        assertEquals(basket, filledBasket);
    }

    @Test
    public void fillBasketTestFalse() {
        BasketService service = new BasketService();
        Basket basket = new Basket(100, 100);
        boolean isFill = service.fillBasket(basket, null);
        assertFalse(isFill);
    }

    @Test
    public void countColorBallsTest() {
        BasketService service = new BasketService();
        int blueBalls = service.countColorBalls(filledBasket, BLUE);
        int expected = 3;
        assertEquals(blueBalls, expected);
    }

    @Test
    public void countColorBallsTestError() {
        BasketService service = new BasketService();
        int blueBalls = service.countColorBalls(filledBasket, null);
        int expected = -1;
        assertEquals(blueBalls, expected);
    }

    @Test
    public void calculateBasketWeightTest() {
        BasketService service = new BasketService();
        double weight = service.calculateBasketWeight(filledBasket);
        double expected = 47;
        assertEquals(weight, expected, 0.001);
    }

    @Test
    public void calculateBasketWeightTestError() {
        BasketService service = new BasketService();
        double weight = service.calculateBasketWeight(null);
        double expected = -1;
        assertEquals(weight, expected);
    }
}