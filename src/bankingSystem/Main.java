package bankingSystem;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println("Before Deletion");
        bank.showAllCustomer();
        bank.deleteCustomerByName("autumn");
        System.out.println("After Deletion");
        bank.showAllCustomer();
    }

}
