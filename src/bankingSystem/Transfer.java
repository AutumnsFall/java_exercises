package bankingSystem;

public class Transfer extends Operation
{
    private String toCustomerId;

    public Transfer(String customerId, double amount, String toCustomerId) {
        super(customerId, amount);
        this.toCustomerId = toCustomerId;
        this.serviceFee = 0.5;
        this.amount -= this.serviceFee;
    }

    public void describeTransfer () {
        System.out.println("Operation Type: Transfer");
        System.out.println("From Customer Id:" + this.customerId);
        System.out.println("To Customer Id:" + this.toCustomerId);
        System.out.println("Date:" + this.date);
        System.out.println("Amount:" + this.amount);
        System.out.println("Service Fee:" + this.serviceFee);
        System.out.println("------------------------------------------");
    }
}
