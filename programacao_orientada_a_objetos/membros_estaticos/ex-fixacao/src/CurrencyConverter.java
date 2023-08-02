public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double converter(double price, double qntd){
        return price * qntd * (1.0 + IOF);
    }
}
