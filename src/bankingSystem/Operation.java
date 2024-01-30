package bankingSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operation {

    protected String customerId;
    protected String date;
    protected double amount;
    protected double serviceFee;

    public Operation(String customerId, double amount) {
        this.customerId = customerId;
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.date = dateTime.format(dateTimeFormatter);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
