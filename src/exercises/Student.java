package exercises;

public class Student extends Human{

    public Student() {
        super();
        this.name = "Hello Student";
//        this.age = 22; // error. age is private
        this.height = 4.6;
    }

    @Override
    public void getInformation() {
        System.out.println("Name:" + name);
        System.out.println("Height:" + height);
        System.out.println("Type: Student");
    }
}
