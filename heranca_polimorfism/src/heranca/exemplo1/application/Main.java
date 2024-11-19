package heranca.exemplo1.application;

import heranca.exemplo1.entities.Account;
import heranca.exemplo1.entities.BusinessAccount;

public class Main {
    public static void main(String[] args) {
        Account ac1 = new Account(1246871264, "Guilherme", 1456.65);
        BusinessAccount bac1 = new BusinessAccount(65387239, "Julia", 5463645.32, 1000.0);

        System.out.println(ac1);
        System.out.println(bac1);
    }
}
