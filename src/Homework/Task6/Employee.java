package Homework.Task6;

/**
 * Created by aivashchenko on 12/19/2016.
 */
public abstract class Employee {
    String name;
    String middleName;
    String surname;

    public Employee(String name, String middleName, String surname) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
    }
    public abstract double getSalary();

    public double moneyPeryear(){
        return getSalary() * 12;

    }


}
