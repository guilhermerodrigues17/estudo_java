package diamondProblem.application;

import diamondProblem.devices.ComboDevice;
import diamondProblem.devices.ConcretePrinter;
import diamondProblem.devices.ConcreteScanner;

public class Main {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");
        System.out.println();

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My email");
        System.out.println("Scan result: " + s.scan());
        System.out.println();

        ComboDevice c = new ComboDevice("2931");
        c.processDoc("My dissertation");
        c.print("My dissertation");
        System.out.println("Scan result: " + c.scan());
        System.out.println();
    }
}
