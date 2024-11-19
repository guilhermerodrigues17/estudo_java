package stream_example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Convert array to stream
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream().map(p -> p * 2);
        System.out.println(Arrays.toString(st1.toArray()));

        //Stream with hardcoded values
        Stream<String> st2 = Stream.of("Maria", "Bob", "Alex");
        System.out.println(Arrays.toString(st2.toArray()));

        //Stream with an infinite loop (iterate) and limit()
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        //Fibonacci sequence
        Stream<Long> fibonacci = Stream.iterate(new Long[] { 0L, 1L }, p -> new Long[] { p[1], p[0] + p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(fibonacci.limit(20).toArray()));
    }
}
