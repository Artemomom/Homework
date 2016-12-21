package Homework.Task6;

/**
 * Created by aivashchenko on 12/19/2016.
 */
public class Zamdirector extends Employee {
    double salary;

    public Zamdirector(String name, String middleName, String surname, double salary) {
        super(name, middleName, surname);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
