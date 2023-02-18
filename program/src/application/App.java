package application;
import java.util.Locale;
import java.util.Scanner;

import application.entities.triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        triangulo x,y;
        x = new triangulo();
        y = new triangulo();

        System.out.println("Enter the measures of triangule x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangule y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangule X area : %.4f\n",areaX);
        System.out.printf("Triangule Y area : %.4f\n",areaY);
        
        if(areaX > areaY)
           System.out.println("Large area: X");
        else
           System.out.println("Large area: Y");

        sc.close();
        
    }
}
