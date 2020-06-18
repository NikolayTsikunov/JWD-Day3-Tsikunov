package by.tsikunov.day3.main;

import by.tsikunov.day3.entity.Basket;
import by.tsikunov.day3.service.BasketService;

public class Main {
    public static void main(String[] args) {
        //List<String> lines = reader.readFromFile("src/main/resources/basket");
        BasketService service = new BasketService();
        Basket basket = service.createBasket();
        service.fillBasket(basket);
    }
}
