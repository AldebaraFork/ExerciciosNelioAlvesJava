import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Triangulo trianguloX = new Triangulo();

        trianguloX.setA(0);
        trianguloX.setB(0);
        trianguloX.setC(0);

        trianguloX.Calcular();
        System.out.printf("area do quadrado X: %.4f%n" , trianguloX.getArea());


        Triangulo trianguloY = new Triangulo();
        trianguloY.setA(0);
        trianguloY.setB(0);
        trianguloY.setC(0);

        trianguloY.Calcular();
        System.out.printf("area do quadrado Y: %.4f%n" , trianguloY.getArea());





    }
}