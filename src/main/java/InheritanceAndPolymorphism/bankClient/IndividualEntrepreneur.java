package InheritanceAndPolymorphism.bankClient;

public class IndividualEntrepreneur extends Client{
    private final double PERCENT  = 0.01;
    private final double PERCENTMO  = 0.005;
    public IndividualEntrepreneur(double checkMoney, double amountOfWithdrawalOrReplenishment) {
        super(checkMoney, amountOfWithdrawalOrReplenishment);
    }

    @Override
    public double cashWithdrawal() {
        setCheckMoney(getCheckMoney()-getAmountOfWithdrawalOrReplenishment());
        return getCheckMoney();
    }

    @Override
    public double replenishmentСash() {
        double x;
        if (getAmountOfWithdrawalOrReplenishment()<1000){
            x = getAmountOfWithdrawalOrReplenishment() * PERCENT;
        }else {
            x = getAmountOfWithdrawalOrReplenishment() * PERCENTMO;
        }
        setCheckMoney((getCheckMoney() - x)+getAmountOfWithdrawalOrReplenishment());
        System.out.println("Коммисия составила " + x);
        System.out.println("Вы пополнили " + getAmountOfWithdrawalOrReplenishment());
        System.out.print("Отсаток ");
        return getCheckMoney();

    }
}
