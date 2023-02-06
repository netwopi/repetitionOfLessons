package InheritanceAndPolymorphism.bankClient;

public abstract class Client {
    private double checkMoney;
    private double amountOfWithdrawalOrReplenishment;

    public Client(double checkMoney, double amountOfWithdrawalOrReplenishment) {
        this.checkMoney = checkMoney;
        this.amountOfWithdrawalOrReplenishment = amountOfWithdrawalOrReplenishment;
    }

    public double getCheckMoney() {
        return checkMoney;
    }

    public void setCheckMoney(double checkMoney) {
        this.checkMoney = checkMoney;
    }

    public double getAmountOfWithdrawalOrReplenishment() {
        return amountOfWithdrawalOrReplenishment;
    }

    public void setAmountOfWithdrawalOrReplenishment(double amountOfWithdrawalOrReplenishment) {
        this.amountOfWithdrawalOrReplenishment = amountOfWithdrawalOrReplenishment;
    }

    public abstract double cashWithdrawal();
     public abstract double replenishmentСash();
}
