package predicateTest_example.application;

import predicateTest_example.model.entities.Product;
import predicateTest_example.model.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 900.0));
        products.add(new Product("Tablet", 500.0));
        products.add(new Product("Mouse", 50.0));
        products.add(new Product("Keyboard", 80.90));

        ProductService ps = new ProductService();

        Double totalSum = ps.filteredSum(products, p -> p.getName().charAt(0) == 'T');

        //Double totalSum = ps.filteredSum(products, p -> p.getPrice() < 100.0);

        System.out.println("sum: " + String.format("%.2f", totalSum));
    }
}
