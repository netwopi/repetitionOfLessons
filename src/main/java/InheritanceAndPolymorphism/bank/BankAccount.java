package InheritanceAndPolymorphism.bank;

public class BankAccount {
    private double check;
    private Integer variableAmount;

    public BankAccount() {
    }

    public BankAccount(Integer check , Integer variableAmount) {
        this.check = check;
        this.variableAmount = variableAmount;
    }

    public double getCheck() {
        return check;
    }

    public void setCheck(double check) {
        this.check = check;
    }

    public Integer getVariableAmount() {
        return variableAmount;
    }

    public void setVariableAmount(Integer variableAmount) {
        this.variableAmount = variableAmount;
    }

    public BankAccount(Integer check) {
        this.check = check;
    }
    //снятие со счета
    public double WithdrawMoney(){
        check = check-variableAmount;
        return check;
    }
    //пополнение счета
    public double ReplenishmentOfTheBalance(){
        check = check+variableAmount;
        return check;
    }
    //Фактический счет
    public double GetAccountBalance(){
        return check;
    }
}
