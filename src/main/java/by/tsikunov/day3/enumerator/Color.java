package by.tsikunov.day3.enumerator;

public enum Color {
    RED("Red"),
    BLUE("Blue"),
    Black("Black"),
    WHITE("White");

    private String color;
    Color(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
