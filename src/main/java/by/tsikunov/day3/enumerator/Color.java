package by.tsikunov.day3.enumerator;

public enum Color {
    RED("Red"),
    BLUE("Blue"),
    BLACK("Black"),
    WHITE("White");

    private final String color;
    Color(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
