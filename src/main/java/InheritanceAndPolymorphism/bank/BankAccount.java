package InheritanceAndPolymorphism.bank;

public class BankAccount {
    public Integer check;
    public
    Integer variableAmount;

    public BankAccount() {
    }

    public BankAccount(Integer check , Integer variableAmount) {
        this.check = check;
        this.variableAmount = variableAmount;
    }

    public Integer getCheck() {
        return check;
    }

    public void setCheck(Integer check) {
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
    public Integer WithdrawMoney(){
        check = check-variableAmount;
        return check;
    }
    //пополнение счета
    public Integer ReplenishmentOfTheBalance(){
        check = check+variableAmount;
        return check;
    }
    //Фактический счет
    public Integer GetAccountBalance(){
        return check;
    }
}
