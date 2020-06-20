package by.tsikunov.day3.service;

import by.tsikunov.day3.entity.Ball;
import by.tsikunov.day3.entity.Basket;
import by.tsikunov.day3.enumerator.ProgramColor;

import java.util.Iterator;
import java.util.List;

public class BasketService {
    public boolean fillBasket(Basket basket, List<Ball> balls) {
        if(basket == null || balls == null || balls.isEmpty()) {
            return false;
        }
        Iterator<Ball> ballIterator = balls.iterator();
        while (ballIterator.hasNext()) {
            Ball ball = ballIterator.next();
            if(!basket.addBall(ball)) {
                ballIterator.remove();
            }
        }
        return true;
    }

    public int countColorBalls(Basket basket, ProgramColor programColor) {
        if(basket == null) {
            return -1;
        }
        List<Ball> balls = basket.getBalls();
        int count = 0;
        for (Ball ball : balls) {
            if(ball.getProgramColor() == programColor) {
                count++;
            }
        }
        return count;
    }

    public double calculateBasketWeight(Basket basket) {
        if(basket == null) {
            return -1;
        }
        List<Ball> balls = basket.getBalls();
        double totalWeight = 0;
        for (Ball ball : balls) {
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }
}
