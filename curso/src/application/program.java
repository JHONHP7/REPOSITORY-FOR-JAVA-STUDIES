package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;
import util.Calculator;
import util.CurrencyConverter;

public class program {
    public static void main (String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        /* calculo raius */
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", Calculator.PI);
        sc.close(); */


        /* COTAÇÃO */
       /*  Scanner sc2 = new Scanner(System.in);
        System.out.println("Qual a cotação do dólar hoje: ");
        double cotacao = sc2.nextDouble();
        System.out.println("Qual valor quer comprar: ");
        double dolarComprado = sc2.nextDouble();
        double value = CurrencyConverter.convercao(cotacao, dolarComprado);
        System.out.printf("Irá custar: %.2f\n", value);
        sc2.close();
 */
        /* ESTOQUE */

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc3.nextLine();
        System.out.print("Price: ");
        double price = sc3.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc3.nextInt();
        Products product = new Products(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc3.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc3.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        
        
        sc3.close();

    }

}
