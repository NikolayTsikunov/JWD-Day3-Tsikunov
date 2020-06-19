package by.tsikunov.day3.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket {

    private final double volume;
    private final double maxWeight;
    private ArrayList<Ball> balls;

    public Basket(double volume, double maxWeight) {
        this.volume = volume;
        this.maxWeight = maxWeight;
        this.balls = new ArrayList<Ball>();
    }

    public List<Ball> getBalls() {
        return Collections.unmodifiableList(balls); //Iterator???
    }

    public boolean addBall(Ball ball) { // TODO: 18.06.2020 change volume and weight
        boolean result = false;
        if(this.volume - ball.getVolume() > 0 &&
                this.maxWeight - ball.getWeight() > 0) {
            balls.add(ball);
            //this.volume -= ball.getVolume();
            result = true;
        }
        return result;
    }

    // TODO: 18.06.2020 equals 
}
