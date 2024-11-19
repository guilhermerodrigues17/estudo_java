package heranca.upcasting_downcasting.application;

import heranca.upcasting_downcasting.entities.Account;
import heranca.upcasting_downcasting.entities.BusinessAccount;
import heranca.upcasting_downcasting.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account ac1 = new Account(1246871264, "Guilherme", 1456.65);
        BusinessAccount bac1 = new BusinessAccount(65387239, "Julia", 5463645.32, 1000.0);

        //UPCASTING
        Account acc1 = bac1;
        Account acc2 = new BusinessAccount(1233, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1234, "Ana", 0.0, 0.01);

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }
    }
}
