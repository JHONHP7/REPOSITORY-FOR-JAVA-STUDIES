package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
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

/*		Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc3.nextLine();
        System.out.print("Price: ");
        double price = sc3.nextDouble();
        
        Products product = new Products(name, price);
        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc3.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc3.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        
        
        sc3.close();*/
        
        Scanner sc4 = new Scanner(System.in);
        Account account;
        System.out.print("Enter account number: ");
        int number = sc4.nextInt();
        sc4.nextLine(); // O NEXTINT FICOU COM UMA QUEBRA DE LINHA PENDENTE,
        				//OU SEJA O NEXTLINE IRÁ CONSUMIR
        System.out.print("Enter account holder: ");
        String holder = sc4.nextLine();
        System.out.print("Is there an initial deposit (Y/N): ");
        char response = sc4.next().charAt(0);
        if(response == 'y') {
        	System.out.print("Enter initial deposit value: ");
        	double initialDeposit = sc4.nextDouble();
        	account = new Account(number, holder, initialDeposit);
        }else {
        	account = new Account(number, holder);
        }
        System.out.println("");
        System.out.println("Account data: ");
        System.out.println(account);
        
        System.out.println("");
        System.out.print("Enter an deposit value: ");
        double depositValue = sc4.nextDouble();
        account.deposit(depositValue);
        System.out.println(account);
        
        System.out.println("");
        System.out.print("Enter an withdraw value: ");
        double withdrawValue = sc4.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println(account);
        sc4.close();
        
        
        
        
    }

}
