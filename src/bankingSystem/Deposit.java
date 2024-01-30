package bankingSystem;

public class Deposit extends Operation {
    public Deposit(String customerId, double amount) {
        super(customerId, amount);
        this.serviceFee = 0;
        this.amount -= this.serviceFee;
    }

    public void describeDeposit () {
        System.out.println("Operation Type: Deposit");
        System.out.println("Customer Id:" + this.customerId);
        System.out.println("Date:" + this.date);
        System.out.println("Amount:" + this.amount);
        System.out.println("Service Fee:" + this.serviceFee);
        System.out.println("------------------------------------------");
    }

}
