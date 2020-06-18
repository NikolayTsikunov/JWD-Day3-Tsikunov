package by.tsikunov.day3.entity;

import by.tsikunov.day3.enumerator.Color;

public class Ball {
    private final double volume;
    private final double weight;
    private final Color color;

    public Ball(double volume, double weight, Color color) {
        this.color = color;
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
}
