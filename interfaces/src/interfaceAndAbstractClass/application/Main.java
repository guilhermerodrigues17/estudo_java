package interfaceAndAbstractClass.application;

import interfaceAndAbstractClass.model.entities.AbstractShape;
import interfaceAndAbstractClass.model.entities.Circle;
import interfaceAndAbstractClass.model.entities.Rectangle;
import interfaceAndAbstractClass.model.enums.Color;

public class Main {
    public static void main(String[] args) {

        AbstractShape circle = new Circle(Color.BLACK, 3.0);
        AbstractShape rectangle = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle area: " + String.format("%.2f", circle.area()));
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Rectangle area: " + String.format("%.2f", rectangle.area()));
        System.out.println("Rectangle color: " + rectangle.getColor());
    }
}
