package implementation;

import api.ICars;
import api.IOrder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Order implements IOrder {

   private ICars car;

    public Order(@Qualifier("Merc") ICars car) {
        this.car = car;
    }

    @Override
    public void printOrder() {
        System.out.printf("Zamowienie zawiera samochod koloru: %s o wartosci: %d",car.getColour(),car.getPrice());
    }
}
