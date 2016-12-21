package Homework.Task6;

/**
 * Created by aivashchenko on 12/19/2016.
 */
public class Designer extends Employee {
    int hoursPerday;
    int moneyPerhour;
    double salary;

    public Designer(String name, String middleName, String surname, int hoursPerday, int moneyPerhour) {
        super(name, middleName, surname);
        this.hoursPerday = hoursPerday;
        this.moneyPerhour = moneyPerhour;

    }

//    public static void main(String[] args) {
//        Monthses[] month = new Monthses[12];
//        month[0] = new Monthses("January", 31 );
//        month[1] = new Monthses("February", 28 );
//        month[2] = new Monthses("March", 31 );
//        month[3] = new Monthses("April", 31 );
//        month[4] = new Monthses("May", 30 );
//        month[5] = new Monthses("Jun", 31 );
//        month[6] = new Monthses("July", 31 );
//        month[7] = new Monthses("August", 30 );
//        month[8] = new Monthses("September", 31 );
//        month[9] = new Monthses("October", 31 );
//        month[10] = new Monthses("November", 31 );
//        month[11] = new Monthses("December", 31 );



//    }

    @Override
    public double getSalary() {
        return salary = 4*(5 * (hoursPerday * MoneyinUah.usdTouah(moneyPerhour)));
    }

}
