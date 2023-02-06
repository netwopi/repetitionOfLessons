package InheritanceAndPolymorphism.bank;

public class CardAccount extends BankAccount{
    private final double PERCENT  = 0.01;
    public CardAccount() {
    }

    public CardAccount(Integer check, Integer variableAmount) {
        super(check, variableAmount);
    }

    public CardAccount(Integer check) {
        super(check);
    }

    @Override
    public double WithdrawMoney() {
        double x = getCheck() * PERCENT;
        setCheck(getCheck() - x);
        System.out.println("Коммисия составила " + x);
        System.out.println("Вы сняли " + getVariableAmount());
        System.out.print("Отсаток ");
        return super.WithdrawMoney();
    }

    @Override
    public double ReplenishmentOfTheBalance() {
        return super.ReplenishmentOfTheBalance();
    }

    @Override
    public double GetAccountBalance() {
        return super.GetAccountBalance();
    }
}
