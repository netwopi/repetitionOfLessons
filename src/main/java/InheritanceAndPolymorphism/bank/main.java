package InheritanceAndPolymorphism.bank;

public class main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000 , 50);
        DepositCurrentAccount depositCurrentAccount = new DepositCurrentAccount(1000,50);
        CardAccount cardAccount = new CardAccount(1000 , 50);
        System.out.println(cardAccount.WithdrawMoney());
        System.out.println(cardAccount.WithdrawMoney());



    }
}
