package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Account;
import entities.Product2;
import entities.Products;
import util.CalcularAlturaPessoa;
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
        
/*        Scanner sc4 = new Scanner(System.in);
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
        sc4.close(); */
        
        				//VETORES\\
        
        Scanner sc5 = new Scanner(System.in);
        int n = sc5.nextInt();
        Product2[] vect = new Product2[n];
        for(int i = 0; i< vect.length;i++) {
        	sc5.nextLine();
        	String name = sc5.nextLine();
        	double price = sc5.nextDouble();
        	
        	vect[i]= new Product2(name,price); //ADCIONANDO UM PRODUTO NA POSIÇÃO I DO VETOR
        }
        double sum = 0.0;
        for(int i = 0; i< vect.length;i++) {
        	sum += vect[i].getPrice();
        }
        double avg = sum/vect.length;
        System.out.printf("AVERAGE PRICE = %.2f",avg);		
        System.out.println("");
        
        			//FOR EACH\\
        System.out.println("----------------");
        String[] vect2 = new String[]{"Maria", "bob", "Alex"};
        for(String obj: vect2) {//PARA CADA OBJ CONTIDO NO VECT2 FAÇA O PRINT
        	System.out.println(obj);
        }
        System.out.println("-------------------");
        			//LISTA\\
        List<String> list = new ArrayList<>();
        
        list.add("Maria");
        list.add("Bob");
        list.add("Alex");
        list.add("Ana");
        list.add(2,"Marco");
        System.out.println(list.size());
        System.out.println("-------------------");
        for(String x: list) {
        	System.out.println(x);
        }
        System.out.println("-------------------");
        
        
        list.removeIf(x -> x.charAt(0) == 'M');//função lambda predicado
        for(String x: list) {
        	System.out.println(x);
        }
        System.out.println("-------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("-------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x: result) {
        	System.out.println(x);
        }
        System.out.println("-------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        
        			// Data e hour \\
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2023-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2023-07-20T01:30:26");
        Instant d06 = Instant.parse("2023-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2023-07-20T01:30:26-03:00");
        LocalDate d08 = LocalDate.parse("20/07/2023", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2023 01:30", fmt2);
        LocalDate d10 = LocalDate.of(2023, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2023, 7, 20, 1, 30);
        
        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
    }
    
    

}
