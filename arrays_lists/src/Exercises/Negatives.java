package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class Negatives {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] arrNumbers = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Digite um numero: ");
            arrNumbers[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i=0; i<n; i++) {
            if(arrNumbers[i] < 0){
                System.out.printf("%d%n", arrNumbers[i]);
            }
        }

        sc.close();
    }
}
