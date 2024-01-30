package bankingSystem;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Bank bank = new Bank();
        bank.showAllCustomer();
        bank.transfer();
        bank.showAllCustomer();
        bank.showAllTransferOperations();
    }

}
