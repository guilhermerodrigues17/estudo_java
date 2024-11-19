package exWithGenerics.entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T>{

    private List<T> values = new ArrayList<>();

    public void addValue(T value) {
        values.add(value);
    }

    public T first() {
        if (values.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }

        return values.getFirst();
    }

    public void print() {
        System.out.print("[");
        if (!values.isEmpty()) {
            System.out.print(values.getFirst());
        }
        for (int i = 1; i < values.size(); i++) {
            System.out.print(", " + values.get(i));
        }
        System.out.println("]");
    }
}
