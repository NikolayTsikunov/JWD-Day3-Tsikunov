package by.tsikunov.day3.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final double maxVolume;
    private final double maxWeight;
    private final ArrayList<Ball> balls;

    public Basket(double volume, double maxWeight) {
        this.maxVolume = volume;
        this.maxWeight = maxWeight;
        this.balls = new ArrayList<>();
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public boolean addBall(Ball ball) {
        boolean result = false;

        if(this.maxVolume - this.calculateVolume() > ball.getVolume() &&
                this.maxWeight - this.calculateWeight() > ball.getWeight()) {
            balls.add(ball);
            result = true;
        }

        return result;
    }

    private double calculateWeight() {
        double result= 0;
        for (Ball ball : balls) {
            result += ball.getWeight();
        }
        return result;
    }

    private double calculateVolume() {
        double result= 0;
        for (Ball ball : balls) {
            result += ball.getVolume();
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Basket basket = (Basket) o;

        return (Double.compare(this.maxVolume, basket.maxVolume) == 0 &&
                Double.compare(this.maxWeight, basket.maxWeight) == 0 &&
                this.balls.equals(basket.balls)
        );
    }

    @Override
    public int hashCode() {
        double result = 1;
        double code = 31;
        result = result * code + maxWeight;
        result = result * code + maxVolume;
        result = result * code + balls.hashCode();
        return (int) result;
    }

    @Override
    public String toString() {
        return String.format("Basket weight = %.2f, volume = %.2f",
                this.maxWeight, this.maxVolume);
    }
}
