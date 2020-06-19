package by.tsikunov.day3.parser;

import by.tsikunov.day3.enumerator.Color;

// TODO: 19.06.2020 Ready, but tests

public class Parser {
    private static final String SPLITTER = " ";
    private static final int VOLUME_INDEX = 0;
    private static final int WEIGHT_INDEX = 1;
    private static final int COLOR_INDEX = 2;
    private static final int NUMBER_BASKET_DATA = 2;
    private static final int NUMBER_BALL_DATA = 3;

    public double[] parseBasketData(String data) {
        String[] parameters = data.split(SPLITTER);

        double[] basketData = new double[NUMBER_BASKET_DATA];
        basketData[VOLUME_INDEX] = Double.parseDouble(parameters[VOLUME_INDEX].trim());
        basketData[WEIGHT_INDEX] = Double.parseDouble(parameters[WEIGHT_INDEX].trim());

        return basketData;
    }

    public double[] parseBallData(String data) {
        String[] parameters = data.split(SPLITTER);

        double[] ballData = new double[NUMBER_BALL_DATA];
        ballData[VOLUME_INDEX] = Double.parseDouble(parameters[VOLUME_INDEX].trim());
        ballData[WEIGHT_INDEX] = Double.parseDouble(parameters[WEIGHT_INDEX].trim());
        ballData[COLOR_INDEX] = Color.valueOf(parameters[COLOR_INDEX].trim()).ordinal();

        return ballData;
    }
}
