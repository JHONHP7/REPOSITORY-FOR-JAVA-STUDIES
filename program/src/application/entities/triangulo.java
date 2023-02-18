package application.entities; // pacote classe

public class triangulo { // classe triangulo
    public double a;
    public double b;
    public double c;

    public double area(){ // Função igual a método não precisa de a,b,c pois já está dentro
        double p = (a + b +c)/2.0;
        return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
