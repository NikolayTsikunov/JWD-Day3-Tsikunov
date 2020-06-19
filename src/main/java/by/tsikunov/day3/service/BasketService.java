package by.tsikunov.day3.service;

import by.tsikunov.day3.entity.Basket;
import by.tsikunov.day3.exception.ProgramException;
import by.tsikunov.day3.parser.Parser;
import by.tsikunov.day3.reader.Reader;

import java.util.List;

public class BasketService {
    private static final String BASKET_FILE = "src/main/resources/basket";
    private static final String BALLS_FILE = "src/main/resources/ball";
    private static final double DEFAULT_VOLUME = 50;
    private static final double DEFAULT_MAX_WEIGHT = 50;
    private static final Reader reader = new Reader();
    private static final Parser parser = new Parser();

    public Basket createBasket() {
        try {
            List<String> parameters = reader.readFromFile(BASKET_FILE);
            double[] parsedParameters = parser.parseBasketData(parameters.get(0));
            return new Basket(parsedParameters[0], parsedParameters[1]);
        } catch (ProgramException e) {
            System.out.println(e.getMessage()); //Logger in the future
        }
        return new Basket(DEFAULT_VOLUME, DEFAULT_MAX_WEIGHT);
    }

//    // TODO: 18.06.2020
//    public boolean fillBasket(Basket basket) {
//        List<String> ballsParameters = reader.readFromFile(BALLS_FILE);
//
//        return;
//    }
}
