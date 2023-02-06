package InheritanceAndPolymorphism.bankClient;

public class EgalEntities extends Client{
    private final double PERCENT  = 0.01;
    public EgalEntities(double checkMoney, double amountOfWithdrawalOrReplenishment) {
        super(checkMoney, amountOfWithdrawalOrReplenishment);
    }

    @Override
    public double cashWithdrawal() {
        double x = getAmountOfWithdrawalOrReplenishment() * PERCENT;
        setCheckMoney(getCheckMoney() -x-getAmountOfWithdrawalOrReplenishment());
        System.out.println("Коммисия составила " + x);
        System.out.println("Вы сняли " + getAmountOfWithdrawalOrReplenishment());
        System.out.print("Отсаток ");
        return getCheckMoney();
    }

    @Override
    public double replenishmentСash() {
        setCheckMoney(getCheckMoney()+getAmountOfWithdrawalOrReplenishment());
        return getCheckMoney();
    }
}
