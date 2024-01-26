package bankingSystem;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers;
    private ArrayList<Withdraw> withdrawalOperations;
    private ArrayList<Deposit> depositOperations;
    private ArrayList<Transfer> transferOperations;
    private InputScanner input;
    public Bank() {
        this.input = new InputScanner();
        this.customers = new ArrayList<Customer>();
    }

    public void createCustomer() {
        int id = this.customers.size() + 1;
        String name = this.input.readStringInput("Enter Your Name");
        String address = this.input.readStringInput("Enter Address");
        String phone = this.input.readStringInput("Enter Phone");
        String dob = this.input.readStringInput("Enter Date of Birth");
        double currCash = this.input.readDoubleInput("Enter Current Cash");
        Customer customer = new Customer( "" + id, name, address, phone, dob, currCash);
        this.customers.add(customer);
    }

}





