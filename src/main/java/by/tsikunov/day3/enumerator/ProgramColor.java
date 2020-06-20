package by.tsikunov.day3.enumerator;

public enum ProgramColor {
    RED("Red"),
    BLUE("Blue"),
    BLACK("Black"),
    WHITE("White");

    private final String color;
    ProgramColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
