import java.util.Locale;
import java.util.Scanner;
import Loja.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Entre com os dados do produto (Nome | Valor | quantidade):");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product);
        
        System.out.println("Entre com o número de produtoque gostaria de add ao estoque:");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println("Update data: " + product);
        
        System.out.println("Entre com o número de produto que gostaria de retirar do estoque:");
        quantity = sc.nextInt(); 
        product.RemoveProducts(quantity);
        System.out.println("Update data: " + product);

        sc.close();
    }
}
