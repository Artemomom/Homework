package Homework.Task6;

/**
 * Created by aivashchenko on 12/19/2016.
 */
public class JuniorManager extends Manager{
    int stavka;
    double salary;

    public JuniorManager(String name, String middleName, String surname, int kassa1, int kassa2, double percent, int stavka) {
        super(name, middleName, surname, kassa1, kassa2, percent);
        this.stavka = stavka;
    }

    @Override
    public double getSalary() {
        return salary = super.getSalary()+ stavka;
    }
}
