package by.tsikunov.day3.entity;

import by.tsikunov.day3.enumerator.ProgramColor;

public class Ball {
    private final double volume;
    private final double weight;
    private final ProgramColor programColor;

    public Ball(double volume, double weight, double color) {
        this.programColor = ProgramColor.values()[(int)color];
        this.volume = volume;
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public ProgramColor getProgramColor() {
        return programColor;
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
                programColor == ball.programColor;
    }

    @Override
    public int hashCode() {
        double result = 1;
        double code = 31;
        result = code * result + volume;
        result = code * result + weight;
        result = code * result + programColor.ordinal();
        return (int)result;
    }

    @Override
    public String toString() {
        return String.format("Ball volume = %.2f, weight= %.2f, color = %s",
                this.volume, this.weight, this.programColor.getColor());
    }
}
