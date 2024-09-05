import java.util.Locale;
import java.util.Scanner;

public class Triangulo {

    Scanner ler = new Scanner(System.in);

    private double A;
    private double B;
    private double C;
    private double p;
    private double area;

    public double getA(){
        return A;
    }
    public double getB(){
        return B;
    }
    public double getC(){
        return C;
    }

    public void setA(double a) {
        System.out.println("Valor de A: ");
        a = ler.nextDouble();
        this.A = a;
    }
    public void setB(double b) {
        System.out.println("Valor de B: " );
        b = ler.nextDouble();
        this.B = b;
    }
    public void setC(double c) {
        System.out.println("Valor de C: " );
        c = ler.nextDouble();
        this.C = c;

    }

    public void Calcular(){
        p = (getA() + getB() + getC()) / 2 ;
        area = Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
    }
    public double getArea(){
        return area;
    }
}
