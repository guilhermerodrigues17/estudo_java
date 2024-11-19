package polimorfism.exerciseFix2.application;

import polimorfism.exerciseFix2.entities.CompanyPayer;
import polimorfism.exerciseFix2.entities.IndividualPayer;
import polimorfism.exerciseFix2.entities.Payer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Payer> payers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char iOrC = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String payerName = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if (iOrC == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                payers.add(new IndividualPayer(payerName, annualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                payers.add(new CompanyPayer(payerName, annualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        for (Payer payer: payers) {
            System.out.printf("%s: $ %.2f%n", payer.getName(), payer.incomeTaxCalc());
        }

        double sum = 0.0;
        for (Payer payer: payers) {
            sum += payer.incomeTaxCalc();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", sum);

        sc.close();
    }
}
