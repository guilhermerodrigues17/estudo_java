package enum_teoria.application;

import enum_teoria.entities.Order;
import enum_teoria.entities.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1234, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
    }
}
