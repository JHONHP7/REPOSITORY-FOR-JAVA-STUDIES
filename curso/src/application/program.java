package application;
import java.util.Locale;
import java.util.Scanner;

import util.Calculator;
import util.CurrencyConverter;

public class program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /* calculo raius */
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n",Calculator.PI);

        /* COTAÇÃO */
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Qual a cotação do dólar hoje: ");
        double cotacao = sc2.nextDouble();
        System.out.println("Qual valor quer comprar: ");
        double dolarComprado = sc2.nextDouble();
        double value = CurrencyConverter.convercao(cotacao,dolarComprado);
        System.out.printf("Irá custar: %.2f\n", value);
        

        sc2.close();
        sc.close();

        
    }
    
 }
