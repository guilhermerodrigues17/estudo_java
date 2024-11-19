package consumer_example.util;

import consumer_example.entities.Product;

import java.util.function.Consumer;

public class UpdatePrice implements Consumer<Product> {
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
