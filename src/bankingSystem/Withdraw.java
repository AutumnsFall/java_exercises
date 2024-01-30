package bankingSystem;

public class Withdraw extends Operation {

    private String withdrawalType;

    public Withdraw(String customerId, double amount, String withdrawalType) {
        super(customerId, amount);
        this.withdrawalType = withdrawalType;
    }
}
