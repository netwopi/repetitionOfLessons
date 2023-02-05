package InheritanceAndPolymorphism.bank;

import java.time.LocalDate;

public class DepositCurrentAccount extends BankAccount{
    LocalDate localDate = LocalDate.now();
    public int num = 0;
    public DepositCurrentAccount() {
    }

    public DepositCurrentAccount(Integer check, Integer variableAmount) {
        super(check, variableAmount);
    }

    public DepositCurrentAccount(Integer check) {
        super(check);
    }


    @Override
    public double WithdrawMoney() {
        if(num>0){
            System.out.println("Нельзя");
        }else {
            return super.WithdrawMoney();
        }

        return getCheck();
    }

    @Override
    public double ReplenishmentOfTheBalance() {
        if (num>0){
            System.out.println("Нельзя снимать в этом месяце");
           LocalDate year = localDate.plusDays(30);
            System.out.println("Вы сможите снять только "  + year);
        }else {

            num++;
            return super.ReplenishmentOfTheBalance();
        }
        return getCheck();
    }

    @Override
    public double GetAccountBalance() {
        return super.GetAccountBalance();
    }
}
