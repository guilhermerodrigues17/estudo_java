package polimorfism.exerciseFix1.application;

import polimorfism.exerciseFix1.entities.ImportedProduct;
import polimorfism.exerciseFix1.entities.Product;
import polimorfism.exerciseFix1.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String productName = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(productName, price, customsFee));
            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.next();
                products.add(new UsedProduct(productName, price, sdf.parse(manufactureDate)));
            } else {
                products.add(new Product(productName, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product: products) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
