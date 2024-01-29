package bankingSystem;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createCustomer();
        bank.searchCustomerByName("autumn");
    }

}
