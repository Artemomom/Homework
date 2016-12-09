package Homework.Task3;

import java.util.Scanner;

import static Homework.Task3.Exercise2_1metod.initBabki;

public class Excersise2_1_1 {
    public static void main (String[] Args){
        Scanner scan = new Scanner(System.in);
        String YES = "Da";
        String konechno = "Yes";

        System.out.println("Privetos, reshil grivny na dollaru pomenyat, da?");
        String otvet = scan.nextLine();//here were writing line. code is executed line by line.

        if (YES.equalsIgnoreCase(otvet)||konechno.equalsIgnoreCase(otvet) ){
            System.out.println("togda poehali: ");
            initBabki();
        } else {
            System.err.println("togda vali davai!");
        }
    }
}
