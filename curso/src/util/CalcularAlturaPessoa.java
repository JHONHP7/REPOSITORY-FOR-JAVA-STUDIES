package util;

import java.util.Scanner;
import java.util.Locale;

public class CalcularAlturaPessoa {
	public static void main (String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height number: ");
        int n = sc.nextInt();
        System.out.println(n);
        double[]vetor = new double[n];
        for(int i = 0; i< n;i++) {
        	System.out.printf("Digite a altura numero %d: ",1+i);
        	double altura = sc.nextDouble();
        	vetor[i] = altura;
        }
       
		double sum = 0.0;
		for(int i = 0; i< n;i++) {
			sum += vetor[i];
		}
		double media = sum/n;
		System.out.printf("%.2f",media);
	}
}
