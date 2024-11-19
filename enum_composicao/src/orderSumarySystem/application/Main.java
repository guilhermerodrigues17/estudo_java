package orderSumarySystem.application;

import orderSumarySystem.entities.Client;
import orderSumarySystem.entities.Order;
import orderSumarySystem.entities.OrderItem;
import orderSumarySystem.entities.Product;
import orderSumarySystem.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = sdf.parse(sc.next());

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int quantityOfOrderItems = sc.nextInt();
        for (int i=0; i<quantityOfOrderItems; i++) {
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(productQuantity, productPrice, product);

            order.addItems(item);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY");
        System.out.println(order);

        sc.close();
    }
}