package heranca.abstractMethods.application;

import heranca.abstractMethods.entities.Circle;
import heranca.abstractMethods.entities.Rectangle;
import heranca.abstractMethods.entities.Shape;
import heranca.abstractMethods.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or circle (r/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("COLOR (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("Shape areas:");
        for (Shape shape: list) {
            System.out.printf("%.2f%n",shape.area());
        }
    }
}
