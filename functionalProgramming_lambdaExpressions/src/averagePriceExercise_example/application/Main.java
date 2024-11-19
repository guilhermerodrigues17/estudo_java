package averagePriceExercise_example.application;

import averagePriceExercise_example.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> products = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            //pipeline average price
            double avg = products.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x + y) / products.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            //pipeline names em ordem decrescente
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> names = products.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .toList();

            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
