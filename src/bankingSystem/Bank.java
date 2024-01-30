package bankingSystem;

import java.time.LocalDate;
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

        this.depositOperations = new ArrayList<Deposit>();
        this.withdrawalOperations = new ArrayList<Withdraw>();
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
        Deposit deposit = new Deposit(customerId, forDeposit);
        this.depositOperations.add(deposit);
        targetCustomer.depositCash(deposit.getAmount());
    }

    public void bankWithdraw () {
        String customerId = this.input.readStringInput("Enter Customer Id:");
        Customer targetCustomer = this.searchCustomerById(customerId);
        if (targetCustomer == null) return;
        double forWithdraw = this.input.readDoubleInput("Enter Withdraw Amount:");
        Withdraw withdraw = new Withdraw(customerId, forWithdraw, "bank");
        this.withdrawalOperations.add(withdraw);
        targetCustomer.withdrawCash(withdraw.getAmount());
    }

    public void atmWithdraw() {
        String customerId = this.input.readStringInput("Enter Customer Id:");
        Customer targetCustomer = this.searchCustomerById(customerId);
        if (targetCustomer == null) return;
        double forWithdraw = this.input.readDoubleInput("Enter Withdraw Amount:");
        Withdraw withdraw = new Withdraw(customerId, forWithdraw, "atm");
        this.withdrawalOperations.add(withdraw);
        targetCustomer.withdrawCash(withdraw.getAmount());
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

    public void updateCustomer () throws CloneNotSupportedException {
        String customerName = this.input.readStringInput("Enter Customer Name:");
        Customer targetCustomer = this.searchCustomerByName(customerName);
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

    public void deleteCustomerByName () throws CloneNotSupportedException {
        String customerName = this.input.readStringInput("Enter Customer Name:");
        Customer targetCustomer = this.searchCustomerByName(customerName);
        this.customers.remove(targetCustomer);
    }

    public void showAllDepositOperations () {
        for (Deposit deposit: this.depositOperations) deposit.describeDeposit();
    }

    public void showAllWithdrawOperations () {
        for (Withdraw withdraw: this.withdrawalOperations) withdraw.describeWithdrawal();
    }
}





