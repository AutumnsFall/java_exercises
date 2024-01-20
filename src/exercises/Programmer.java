package exercises;

public class Programmer extends Employee{

    public Programmer() {
        this.info = "this is programmer";
        this.totalSalary = 80;
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
