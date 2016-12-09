package Homework.Task3;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;





public class Exercise2_1metod {


    public static class BankExtended {
        private String name;
        private String[] currencies;
        private double[] coefs;
        public BankExtended(String _name, String _currencies[], double _coefs[]) {
            name = _name;
            currencies = _currencies;
            coefs = _coefs;
        }


        public double getCoef(String checkCurrency) {
            for (int i = 0; i < currencies.length; i++) {
                if (currencies[i].equalsIgnoreCase(checkCurrency))
                    return coefs[i];
            }
            return 0;
        }
    }

    public static void  initBabki(){


        BankExtended otp = new BankExtended("Privat",new String[]{"USD", "RUB", "EUR"}, new double[]{27, 0.56, 29.9});
        BankExtended ukrSib = new BankExtended("UkrSib",new String[]{"USD", "RUB", "EUR"}, new double[]{26.5, 0.37, 30});

        BankExtended banks[] = {new BankExtended("OTP",new String[]{"USD", "RUB", "EUR"}, new double[]{26.9, 0.42, 29.7}),
                otp, ukrSib};


        Scanner scan = new Scanner(System.in);

        System.out.println("Skoko denzhat est to: ");
        int amount = scan.nextInt();
        System.out.println("A na shto menyat hocheshm? (USD, UER, RUB): ");
        String userEnteredValuta = scan.next().toUpperCase();
        System.out.println("nu ladno ya ponyal, a po kursu kakogo banka? (Privat, OTP ili Ukrsib): ");
        BankExtended userChoosedBank = null;
        while (userChoosedBank == null) {
            String userInputBankName = scan.next();


            for (int i = 0; i < banks.length; i++) {
                if (banks[i].name.equalsIgnoreCase(userInputBankName))
                userChoosedBank = banks[i];
                break;
            }
        }

//        инт валюта = userChoosedBank.getCoef(userEnteredValuta)ж
//                если валюта == 0ж
//                то НИХУЯ, значит че-то ввели неправлиьно или неправильный метод реализовали
        System.out.println("na, zaberi svoi babki po " + userChoosedBank.name + ": " + Math.round(amount/userChoosedBank.getCoef(userEnteredValuta)));
//        System.out.println("na, zaberi svoi babki po " + String.format("%s: %.2f:" + userChoosedBank.name, amount/userChoosedBank.getCoef(userEnteredValuta)));


    }
}
