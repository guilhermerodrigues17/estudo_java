package predicate_example.application;

import predicate_example.entities.Product;
import predicate_example.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 900.0));
        products.add(new Product("Notebook", 450.0));
        products.add(new Product("Mouse", 80.0));
        products.add(new Product("Keyboard", 70.0));

        //### Predicate implementation
        //products.removeIf(new ProductPredicate());

        //### Reference method static
        //products.removeIf(Product::staticPredicate);

        //### Reference method nonStatic
        //products.removeIf(Product::nonStaticPredicate);

        //## Expression Lambda inline
        products.removeIf(product -> product.getPrice() >= 100.0);

        for (Product p : products) {
            System.out.println(p);
        }
    }
}
