package bankingSystem;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Bank bank = new Bank();
        bank.showAllCustomer();
        bank.updateCustomer("autumn");
        bank.showAllCustomer();
    }

}
