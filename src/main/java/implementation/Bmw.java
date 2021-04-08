package implementation;

import api.ICars;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component
@Qualifier("Beema")
public class Bmw implements ICars {

   private int price;
   private String colour;

    public Bmw(@Value("111111") int price,@Value("Bmw-Klasa") String colour) {
        this.price = price;
        this.colour = colour;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getColour() {
        return colour;
    }
}
