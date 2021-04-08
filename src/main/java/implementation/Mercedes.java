package implementation;

import api.ICars;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@Qualifier("Merc")
public class Mercedes implements ICars {
    private int price;
    private String colour;

    public Mercedes(@Value("17") int price,@Value("czerwnott") String colour) {
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
