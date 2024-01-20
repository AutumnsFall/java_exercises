package exercises;

import java.util.Scanner;
/*
Write a Java program to create an abstract class Employee with abstract methods
calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that
extend the Employee class and implement the respective methods to calculate salary
and display information for each role.
 */
public class Main {
    public static void main(String[] args) {
        Employee e = new Manager();
        e.calculateSalary();
        e.displayInfo();
        System.out.println(".........................");
        e = new Programmer();
        e.calculateSalary();
        e.displayInfo();

    }
}

