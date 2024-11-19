package bankAccountExercise.application;

import bankAccountExercise.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account1;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char initialDepositVerify = sc.next().charAt(0);

        if(initialDepositVerify == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account1 = new Account(number, holder, initialDeposit);
        }
        else {
            account1 = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account1);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        account1.deposit(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account1);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        account1.withdraw(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account1);

        sc.close();
    }
}
