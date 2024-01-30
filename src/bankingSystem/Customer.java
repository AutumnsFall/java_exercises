package bankingSystem;

public class Customer implements Cloneable{

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

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public void depositCash(double depositAmt) {
        this.currCash += depositAmt;
    }

    public void withdrawCash(double withdrawAmt) {
        this.currCash -= withdrawAmt;
    }

    public String getId() {
        return id;
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

    public String getName() {
        return name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }
}
