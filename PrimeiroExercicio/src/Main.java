import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;
        double areaX, areaY;
        double p ;



        System.out.println("Insira os dados do quadrado x:");
        xA = ler.nextDouble();
        xB = ler.nextDouble();
        xC = ler.nextDouble();


        System.out.println("Insira os dados do quadrado y:");
        yA = ler.nextDouble();
        yB = ler.nextDouble();
        yC = ler.nextDouble();

        p = (xA + xB + xC) / 2 ;
        areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2 ;
        areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("area do quadrado X: %.4f%n" , areaX);
        System.out.printf("area do quadrado y: %.4f%n" , areaY);

        if (areaX > areaY){
            System.out.println("Quadrado X é maior");
        }else {
            System.out.println("Quadrado Y é maior");
        }

        ler.close();


    }
}