package function_example.application;

import function_example.entities.Product;
import function_example.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Desktop", 2000.0));
        products.add(new Product("Tv", 900.0));
        products.add(new Product("Notebook", 450.0));
        products.add(new Product("Mouse", 80.0));
        products.add(new Product("Keyboard", 70.90));

        //### implements function
        //List<String> names = products.stream().map(new UpperCaseName()).collect(Collectors.toList());

        //### reference method static
        //List<String> names = products.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //### reference method nonstatic
        //List<String> names = products.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        //### lambda expression inline
        List<String> names = products.stream().map(product -> product.getName().toUpperCase()).toList();

        names.forEach(System.out::println);
    }
}
