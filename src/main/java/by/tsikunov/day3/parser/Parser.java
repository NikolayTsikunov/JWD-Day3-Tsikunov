package by.tsikunov.day3.parser;

import by.tsikunov.day3.exception.ProgramException;

public class Parser {
    public double[] parseBasketData(String data) throws ProgramException {
        String[] parameters = data.split(" ");
        if(parameters.length != 2) {
            throw new ProgramException("Wrong number of parameters for basket!");
        }
        double[] result = new double[2];
        try {
            result[0] = Double.parseDouble(parameters[0]);
            result[1] = Double.parseDouble(parameters[1]);
        } catch (NumberFormatException e) {
            throw new ProgramException("Can't parse string to double", e);
        }
        return result;
    }
}
