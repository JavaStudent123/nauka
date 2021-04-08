package implementation;

import api.ICars;
import api.IOrder;
import org.springframework.beans.factory.annotation.Autowired;

public class FastOrder implements IOrder {

    @Autowired

    private ICars car;

    public FastOrder(ICars car) {
        this.car = car;
    }

    @Override
    public void printOrder() {
        System.out.printf("Zamowienie SZYBKIE zawiera samochod koloru: %s o wartosci: %d",car.getColour(),car.getPrice());

    }
}
