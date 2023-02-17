import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor!");
        int hora = sc.nextInt();

        if(hora < 12){
            System.out.println("Bom dia!");
        }
        else if(hora >= 12 && hora < 18){
            System.out.println("Boa Tarde!");
        }
        else{
            System.out.println("12Boa noite!");
        }
        sc.close();
    }
}