package InheritanceAndPolymorphism.bankClient;

public class Individual extends Client{

    public Individual(double checkMoney, double amountOfWithdrawalOrReplenishment) {
        super(checkMoney, amountOfWithdrawalOrReplenishment);
    }

    @Override
    public double cashWithdrawal() {
        setCheckMoney(getCheckMoney()-getAmountOfWithdrawalOrReplenishment());
        return getCheckMoney();
    }

    @Override
    public double replenishmentСash() {
        setCheckMoney(getCheckMoney()+getAmountOfWithdrawalOrReplenishment());
        return getCheckMoney();
    }
}
