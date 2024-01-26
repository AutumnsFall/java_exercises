package bankingSystem;

public class Customer {

    private String id;
    private String name;
    private String address;
    private String phone;
    private String dob;
    private double currCash;

    public Customer(String id, String name, String address, String phone, String dob, double currCash) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.dob = dob;
        this.currCash = currCash;
    }

    public void describeCustomer() {
        System.out.println("Id:" + this.id);
        System.out.println("Name:" + this.name);
        System.out.println("Address:" + this.address);
        System.out.println("Phone" + this.phone);
        System.out.println("Date of Birth:" + this.dob);
        System.out.println("Current Cash in Bank:" + this.currCash);
        System.out.println("------------------------------------------");
    }
}
