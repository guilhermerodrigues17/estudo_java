package blocoTryCatch.exerciseFix.application;

import blocoTryCatch.exerciseFix.model.entities.Account;
import blocoTryCatch.exerciseFix.model.exceptions.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data:");
        System.out.print("Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(accountNumber, accountHolder, withdrawLimit);
        account.deposit(initialBalance);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("New balance: %.2f%n", account.getBalance());
        }
        catch (WithdrawException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
