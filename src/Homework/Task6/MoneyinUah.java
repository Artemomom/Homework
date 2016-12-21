package Homework.Task6;

/**
 * Created by aivashchenko on 12/19/2016.
 */
public class MoneyinUah {
    private MoneyinUah() {}
    private  static  final double uahTousd = 25.0;
    public   static  double usdTouah(double uahamount){
        return  uahamount * uahTousd;
    }

}
