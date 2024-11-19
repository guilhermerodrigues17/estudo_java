package loops;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        char rep;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double tempC = sc.nextDouble();

            double tempF = 9 * tempC / 5 + 32;
            System.out.printf("Equivalente a Fahrenheit: %.1f%n", tempF);

            System.out.print("Deseja repetir (s/n)? ");
            rep = sc.next().charAt(0);
        } while (rep != 'n');

        sc.close();
    }
}
