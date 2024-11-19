package heranca.sobreposicao.application;

import heranca.sobreposicao.entities.Account;
import heranca.sobreposicao.entities.BusinessAccount;
import heranca.sobreposicao.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(1002, "Joao", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1435, "Jonas", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1567, "Maria", 1000.0, 2000.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
