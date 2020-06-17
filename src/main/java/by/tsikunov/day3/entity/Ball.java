package by.tsikunov.day3.entity;

import by.tsikunov.day3.enumerator.Color;

public class Ball {
    private double volume;
    private Color color;

    public Ball(double volume, Color color) {
        this.color = color;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
