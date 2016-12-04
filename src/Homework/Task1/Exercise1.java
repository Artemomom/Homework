package Homework;

public class Exercise1 {


        public static void main(String[] args) {
            //System.out.println("Hello World");
            // long Germany = 1213214234;
            //long England  = 124124124;
            //String A = "England";
            //String B = "Ukraine";
            //String C = "Germany";
            //int d = 809934144;
            //int e = 812341224;
            //int f = 121234213;

            // System.out.println(A + d);
//Exercise 1
            int Ukraine = 56789243;
            int Germany = 677896432;
            int England = 787645249;
            System.out.println("People that are leaving in Ukraine = " +Ukraine);
            System.out.println("People that are leaving in Germany = " +Germany);
            System.out.println("People that are leaving in England = "+England);
//Exercise 2
            System.out.println("Exercise 2");
            //Ukraine
            System.out.println("Ukraine");
            double SUkraine = 603.628;
            double SEngland = 243.610;
            int SGermany = 357021; //these two countries can be used exactly as previous
            double SNorway = 385.178;
            int m2 = 1000000;
            double mi2 = 0.38610;
            double resultUkraineM2 = SUkraine * m2;
            double ResultUkraineMi2 = SUkraine * mi2;
            double ResultEnglandM2 = SEngland * m2;
            double ResultEnglandMi2 = SEngland * mi2;
            System.out.println ("Square of Ukraine in km2 = "+SUkraine);
            //System.out.println ("Square of Ukraine in m2 = "+(SUkraine * m2));
            System.out.println ("Square of Ukraine in m2 = "+resultUkraineM2);
            //System.out.println ("Square of Ukraine in mi2 = "+(SUkraine * mi2));
            System.out.println ("Square of Ukraine in mi2 = "+ResultUkraineMi2);
            //England
            System.out.println("England");
            System.out.println ("Square of England in km2 = "+SEngland);
            //System.out.println ("Square of Ukraine in mi2 = "+(SEngland * m2));
            System.out.println ("Square of England in m2 = "+ResultEnglandM2);
            //System.out.println ("Square of Ukraine in mi2 = "+(SEngland * mi2));
            System.out.println("Square of England in mi2 = "+ResultEnglandMi2);
            //Exercise 3
            System.out.println("Exercise 3");
            double[] Uah_to = {27.1, 29.0, 0.417};
            String[]currency = {"USD","EUR","RUB"};
            int UAH = 5000;
            System.out.println("5k uah in USD will be = "+Math.round(UAH/Uah_to[0])+" "+currency[0]);
            System.out.println("5k uah in EUR will be = "+Math.round(UAH/Uah_to[1])+" "+currency[1]);
            System.out.println("5k uah in RUB will be = "+Math.round(UAH/Uah_to[2])+" "+currency[2]);
            //Exercise 4-4.1
            System.out.println("Exercise 4");
            int[] Age = {22,31,26,19};
            String[][] NameandJob = {
                    {"Anya","Petya","Olya","Sasha"},
                    {"QA","Dev","BA","PM"}
            };
            //System.out.printf("Name: %s  Job: %s  Age: %d years \n", NameandJob[0][3], NameandJob[1][3], Age[4]); - doesn't worked
            System.out.println("Name: "+NameandJob[0][3] +"; Job: "+NameandJob[1][3] +"; Age: "+Age[2]);
            System.out.println("Name: "+NameandJob[0][2] +"; Job: "+NameandJob[1][1] +"; Age: "+Age[3]);
            System.out.println("Name: "+NameandJob[0][0] +"; Job: "+NameandJob[1][0] +"; Age: "+Age[1]);
            System.out.println("Name: "+NameandJob[0][1] +"; Job: "+NameandJob[1][2] +"; Age: "+Age[0]);
        }
}
