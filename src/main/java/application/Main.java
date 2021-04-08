package application;

import api.IOrder;
import configuration.AutoConfig;
import configuration.Config;
import implementation.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        IOrder order = context.getBean(IOrder.class);
        order.printOrder();
        IOrder order2 = context.getBean(Order.class);

    }
}
