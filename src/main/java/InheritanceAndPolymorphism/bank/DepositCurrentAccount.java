package InheritanceAndPolymorphism.bank;

public class DepositCurrentAccount extends BankAccount{
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
    public Integer WithdrawMoney() {
        if(num>0){
            System.out.println("Нельзя");
        }else {
            return super.WithdrawMoney();
        }

        return getCheck();
    }

    @Override
    public Integer ReplenishmentOfTheBalance() {
        if (num>0){
            System.out.println("Нельзя снимать в этом месяце");
        }else {
            num++;
            return super.ReplenishmentOfTheBalance();
        }
        return getCheck();
    }

    @Override
    public Integer GetAccountBalance() {
        return super.GetAccountBalance();
    }
}
