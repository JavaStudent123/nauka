package configuration;


import api.ICars;
import api.IOrder;
import implementation.Bmw;
import implementation.Mercedes;
import implementation.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {


//    @Bean
//    public ICars car (){
//        return new Mercedes(20,"Mercedes-White");
//    }
//
//    @Bean
//    public IOrder order(ICars car){
//        return new Order(car);
//    }
}
