package implementation;

import api.ICars;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@Qualifier("Merc")
@PropertySource("C:\\Users\\Dell\\IdeaProjects\\nauka\\src\\properties\\ceny")
public class Mercedes implements ICars {
    private int price;
    private String colour;

    public Mercedes(@Value("${cena_mercedesa}") int price,@Value("${nazwa}") String colour) {
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
