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
        this.customers.add(this.dummyCustomer());
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

    public Customer dummyCustomer () {
        return new Customer("1", "Autumn", "Somewhere", "12345", "Sometime", 12.5);
    }

    public void deposit () {
        String customerId = this.input.readStringInput("Enter Customer Id:");
        Customer targetCustomer = this.searchCustomerById(customerId);
        if (targetCustomer == null) return;
        double forDeposit = this.input.readDoubleInput("Enter Deposit Amount:");
        targetCustomer.depositCash(forDeposit);
    }

    public Customer searchCustomerById (String id) {
        for (Customer currCustomer: this.customers) {
            if (currCustomer.getId().equalsIgnoreCase(id)) {
                System.out.println("Customer Found");
                return currCustomer;
            }
        }
        System.out.println("Customer does not exist");
        return null;
    }

    public Customer searchCustomerByName (String name) throws CloneNotSupportedException {
        for (Customer currCustomer: this.customers) {
            if (currCustomer.getName().equalsIgnoreCase(name)) {
                System.out.println("Customer Found");
                return currCustomer;
//                Customer clone = (Customer) currCustomer.clone();
//                return clone;
            }
        }
        System.out.println("Customer does not exist");
        return null;
    }

    public int searchCustomerIndexByName (String name) {
        int index = 0;
        for (Customer currCustomer: this.customers) {
            if (currCustomer.getName().equalsIgnoreCase(name)) {
                System.out.println("Customer Found");
                return index;
            }
            index++;
        }
        System.out.println("Customer does not exist");
        return -1;
    }

    public void updateCustomer (String name) throws CloneNotSupportedException {
        Customer targetCustomer = this.searchCustomerByName(name);
        if (targetCustomer != null) {
            String newDob = this.input.readStringInput("Current (" + targetCustomer.getDob() + "). Enter New Value:");
//            int index = this.searchCustomerIndexByName(name);
            targetCustomer.setDob(newDob);
//            this.customers.set(index, targetCustomer);
        }
    }

    public void showAllCustomer () {
        for (Customer currCustomer: this.customers) {
            currCustomer.describeCustomer();
        }
    }

    public void deleteCustomerByName (String name) throws CloneNotSupportedException {
        Customer targetCustomer = this.searchCustomerByName(name);
        this.customers.remove(targetCustomer);
    }

}





