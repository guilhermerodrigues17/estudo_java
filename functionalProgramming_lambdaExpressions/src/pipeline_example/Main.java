package pipeline_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        //pipeline 1
        Stream<Integer> st1 = list.stream().map(x -> x * 15);
        System.out.println(Arrays.toString(st1.toArray()));

        //pipeline 2
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum: " + sum);

        //pipeline 3
        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 40)
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));
    }
}
