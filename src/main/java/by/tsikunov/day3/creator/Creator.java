package by.tsikunov.day3.creator;

import by.tsikunov.day3.entity.Ball;
import by.tsikunov.day3.entity.Basket;
import by.tsikunov.day3.exception.ProgramException;
import by.tsikunov.day3.parser.Parser;

import java.util.ArrayList;
import java.util.List;

public class Creator { // TODO: 19.06.2020 Ready, but tests
    private static final int VOLUME_INDEX = 0;
    private static final int WEIGHT_INDEX = 1;
    private static final int COLOR_INDEX = 2;

    public List<Basket> createBasket(List<String> basketData) throws ProgramException {
        // TODO: 19.06.2020 нул и пустой в тестах покрутить
        if(basketData.isEmpty()) {
            throw new ProgramException("Empty baskets entry data!");
        }

        Parser parser = new Parser();
        List<Basket> baskets = new ArrayList<>();

        for (String str : basketData) {
            double[] basketInfo = parser.parseBasketData(str);
            baskets.add(new Basket(
                    basketInfo[VOLUME_INDEX],
                    basketInfo[WEIGHT_INDEX]
                    )
            );
        }
        return baskets;
    }

    public List<Ball> createListBalls(List<String> ballsData) throws ProgramException {

        if(ballsData.isEmpty()) {
            throw new ProgramException("Empty balls entry data!");
        }

        Parser parser = new Parser();
        List<Ball> balls = new ArrayList<>();

        for (String str: ballsData) {
            double[] ballsInfo = parser.parseBallData(str);
            balls.add(new Ball(
                    ballsInfo[VOLUME_INDEX],
                    ballsInfo[WEIGHT_INDEX],
                    ballsInfo[COLOR_INDEX]
                    )
            );
        }
        return balls;
    }
}
