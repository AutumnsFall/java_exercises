package exercises;

public class Manager extends Employee{

    public Manager() {
        this.info = "this is manager";
        this.totalSalary = 100;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary: " + this.totalSalary);
    }

    @Override
    public void displayInfo() {
        System.out.println("Info:" + this.info);
    }
}
