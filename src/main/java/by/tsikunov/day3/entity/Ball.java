package by.tsikunov.day3.entity;

import by.tsikunov.day3.enumerator.Color;

public class Ball {
    private final double volume;
    private final double weight;
    private final Color color;

    public Ball(double volume, double weight, double color) {
        this.color = Color.values()[(int)color];
        this.volume = volume;
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ball ball = (Ball) o;
        return Double.compare(volume, ball.volume) == 0 &&
                Double.compare(weight, ball.weight) == 0 &&
                color == ball.color;
    }

    @Override
    public int hashCode() {
        double result = 1;
        double code = 31;
        result = code * result + volume;
        result = code * result + weight;
        result = code * result + color.ordinal();
        return (int)result;
    }

    @Override
    public String toString() {
        return String.format("Ball volume = %.2f, weight= %.2f, color = %s",
                this.volume, this.weight, this.color.getColor());
    }
}
