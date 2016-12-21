package Homework.Task6;

/**
 * Created by aivashchenko on 12/19/2016.
 */
public class Manager extends Employee {
    int kassa1;
    int kassa2;
    double percent;
    double salary;

    public Manager(String name, String middleName, String surname, int kassa1, int kassa2, double percent) {
        super(name, middleName, surname);
        this.kassa1 = kassa1;
        this.kassa2 = kassa2;
        this.percent = percent;
    }

    @Override
    public double getSalary() {
        return salary = ((kassa1* percent) + (kassa2*percent))/2;
    }
}
