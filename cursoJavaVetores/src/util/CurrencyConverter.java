package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static  double  convercao (double cotacao, double amount) {    
        double result = cotacao * amount;
        return (result) + ((result)*(IOF));

    }

}
