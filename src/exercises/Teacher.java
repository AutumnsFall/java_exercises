package exercises;

public class Teacher extends Human{

    public Teacher() {
        super("Teacher Moon", 50, 10);
//        this.name = "Teacher Moon";
//        this.height = 10;
//        this.age = 50;
    }

    @Override
    public void getInformation() {
        System.out.println("Name:" + name);
        System.out.println("Height:" + height);
    }
}
