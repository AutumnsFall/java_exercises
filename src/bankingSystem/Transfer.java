package bankingSystem;

public class Transfer extends Operation
{
    private String toCustomerId;

    public Transfer(String customerId, double amount, String toCustomerId) {
        super(customerId, amount);
        this.toCustomerId = toCustomerId;
    }
}
