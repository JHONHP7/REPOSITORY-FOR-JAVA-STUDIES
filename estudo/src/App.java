import java.util.Scanner;
import java.util.function.Function;

public class App {
    
    public static void main(String[] args) throws Exception {
        /* APRENDENDO IF E ELSE */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor!\n");
        int hora = sc.nextInt();

        if(hora < 12){
            System.out.println("Bom dia!\n");
        }
        else if(hora >= 12 && hora < 18){
            System.out.println("Boa Tarde!\n");
        }
        else{
            System.out.println("Boa noite!\n");
        }


        /* APRENDENDO ESTRUTURA DE REPETIÇÃO */

        int j = 5;
        while(j >= 0){
            System.out.println("O valor de J é = " + j);
            j -= 1;
        }

        /* APRENDENDO FOR */
        int y = 0, i;
        for(i = 5; i >= y; i--){
            System.out.println("O valor de Y = " + i);
        }

        /* FUNÇÕES PARA FORMATAR STRING */
        //TRANSFORMAR EM MINÚSCULO toLowerCase(),
        // TRANSFORMAR EM MAIUSCULO toUpperCase(),

        String original = "asjhd SDJOI ioija jIJSIJDasdj  ";
        String s01 = original.toLowerCase();
        System.out.println(s01);
        String s02 = original.toUpperCase();
        System.out.println(s02);
        
        //REMOVER ESPAÇOS trim()
        String s03 = original.trim();
        System.out.println(s03);
        
        /* RECORTAR STRING */
        //substring(inicio),substring(inicio,fim)
        
        /* SUBSTITUIR STRING*/
        //Replace(char,char), replace(string, string)

        /* BUSCAR STRING */
        //indexOf, LastIndexOf

        //str.Split("")
        System.out.println("Digite os 3 valores");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maior = max(a,b,c);
        System.out.println("O maior valor é = " + maior);

        sc.close();




    }
        /* FUNÇÕES */
        public static int max(int a, int b, int c){
            int aux = 0;
            if(a>b && a>c)
                aux = a;
            else if(b>a &&  b > c)
                aux = b;
            else aux = c;
    
            return aux;
        }

}