package Homework.Task6;

/**
 * Created by aivashchenko on 12/19/2016.
 */
public class main {
    public static void main(String[] args) {
        Employee[] empolees= new Employee[4];
        empolees[0] = new Zamdirector("Elena", "Lvovna", "Ivanova", 4500 );
        empolees[1] = new Designer("Dmitry", "Vladimirovich", "Vakulenko", 8, 7 );
        empolees[2] = new Manager("Anna", "Pavlovna", "Korenkova", 50000, 65000, 0.05 );
        empolees[3] = new JuniorManager("Tatyana", "Sergeevna", "Petrova", 50000, 65000, 0.03, 1000 );

        for (Employee empolee : empolees) {
            System.out.println("money per month " +empolee.surname+" "+empolee.name+" "+empolee.middleName+" "+"salary per month: "+ empolee.getSalary());
            System.out.println("money per year " + empolee.surname+" "+empolee.name+" "+empolee.middleName+" "+"salary per year: "+ empolee.moneyPeryear());

        }
    }
}
