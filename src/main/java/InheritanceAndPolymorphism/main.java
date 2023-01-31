package InheritanceAndPolymorphism;

import InheritanceAndPolymorphism.bank.BankAccount;
import InheritanceAndPolymorphism.bank.DepositCurrentAccount;

public class main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000 , 50);
        DepositCurrentAccount depositCurrentAccount = new DepositCurrentAccount(1000,50);

        System.out.println(depositCurrentAccount.WithdrawMoney());
        System.out.println(depositCurrentAccount.WithdrawMoney());


    }
}
