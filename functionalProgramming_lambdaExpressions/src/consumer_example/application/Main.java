package consumer_example.application;

import consumer_example.entities.Product;
import consumer_example.util.UpdatePrice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 900.0));
        products.add(new Product("Notebook", 450.0));
        products.add(new Product("Mouse", 80.0));
        products.add(new Product("Keyboard", 70.90));

        //### implements Consumer
        //products.forEach(new UpdatePrice());

        //### reference method static
        //products.forEach(Product::staticUpdatePrice);

        //### reference method nonstatic
        //products.forEach(Product::nonStaticUpdatePrice);

        //### lambda expression inline
        products.forEach(product -> product.setPrice(product.getPrice() * 1.1));

        products.forEach(System.out::println);
    }
}
