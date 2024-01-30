package bankingSystem;

public class Withdraw extends Operation {

    private String withdrawalType; // atm, bank

    public Withdraw(String customerId, double amount, String withdrawalType) {
        super(customerId, amount);
        this.withdrawalType = withdrawalType;
        this.serviceFee = this.withdrawalType.equalsIgnoreCase("atm")? 1 : 0;
        this.amount += this.serviceFee;
    }

    public void describeWithdrawal () {
        System.out.println("Operation Type: Withdrawal");
        System.out.println("Customer Id:" + this.customerId);
        System.out.println("Date:" + this.date);
        System.out.println("Amount:" + this.amount);
        System.out.println("Service Fee:" + this.serviceFee);
        System.out.println("Withdrawal Type:" + this.withdrawalType);
        System.out.println("------------------------------------------");
    }

}
