package loops;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos números serão somados: ");
        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i<N; i++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.printf("A soma dos números foi %d", soma);
        sc.close();
    }
}
