package by.tsikunov.day3.parser;

import by.tsikunov.day3.enumerator.Color;
import by.tsikunov.day3.exception.ProgramException;

public class Parser {
    private static final String SPLITTER = " ";
    private static final int VOLUME_INDEX = 0;
    private static final int WEIGHT_INDEX = 1;
    private static final int COLOR_INDEX = 2;
    private static final int NUMBER_BASKET_DATA = 2;
    private static final int NUMBER_BALL_DATA = 3;

    public double[] parseBasketData(String data) throws ProgramException {
        String[] parameters = data.split(SPLITTER);

        if(parameters.length != NUMBER_BASKET_DATA) {
            throw new ProgramException("Wrong number of parameters for basket!");
        }

        double[] basketData = new double[NUMBER_BASKET_DATA];
        try {
            basketData[VOLUME_INDEX] = Double.parseDouble(parameters[VOLUME_INDEX].trim());
            basketData[WEIGHT_INDEX] = Double.parseDouble(parameters[WEIGHT_INDEX].trim());
        } catch (NumberFormatException e) {
            throw new ProgramException("Can't format data", e);
        }
        return basketData;
    }

    public double[] parseBallData(String data) throws ProgramException {
        String[] parameters = data.split(SPLITTER);

        if(parameters.length != NUMBER_BALL_DATA) {
            throw new ProgramException("Wrong number of parameters for ball!");
        }

        double[] ballData = new double[NUMBER_BALL_DATA];
        try {
            ballData[VOLUME_INDEX] = Double.parseDouble(parameters[VOLUME_INDEX].trim());
            ballData[WEIGHT_INDEX] = Double.parseDouble(parameters[WEIGHT_INDEX].trim());
            ballData[COLOR_INDEX] = Color.valueOf(parameters[COLOR_INDEX].trim()).ordinal();
        } catch (NumberFormatException e) {
            throw new ProgramException("Can't format data", e);
        }
        return ballData;
    }
}
