package exercises;

public class Human extends Object {
    public String name;
    protected int age;
    protected double height;

    public Human() {
        super();
        this.name = "Hello Human";
        this.age = 20;
        this.height = 5.8;
    }

    public Human(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void getInformation() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Height:" + height);
    }

}
