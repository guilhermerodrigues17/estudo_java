package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("João");
        list.add("Guilherme");
        list.add("Gustavo");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println("____________________");

        list.add(2, "Sabrina");
        System.out.println(list);
        System.out.println("____________________");

        list.remove("Sabrina");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'G');
        System.out.println(list);
        System.out.println("____________________");

        list.add("João");
        list.add("Guilherme");
        list.add("Gustavo");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').toList();
        System.out.println(result);
        System.out.println(result.indexOf("Guilherme"));

        System.out.println("____________________");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("____________________");

        for (String x : result) {
            System.out.println(x);
        }
    }
}
