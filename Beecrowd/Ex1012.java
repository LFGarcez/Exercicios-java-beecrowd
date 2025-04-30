import java.util.Scanner;
import java.util.Locale; 

    public class Ex1012 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Double a = sc.nextDouble();
            Double b = sc.nextDouble();
            Double c = sc.nextDouble();

            //a) a área do triângulo retângulo que tem A por base e C por altura.
            //b) a área do círculo de raio C. (pi = 3.14159).
            //c) a área do trapézio que tem A e B por bases e C por altura.
            //d) a área do quadrado que tem lado B.
            //e) a área do retângulo que tem lados A e B.

            double tri = (a * c) / 2;
            double cir = (3.14159 * Math.pow(c,2));
            double tra = (a + b) * c / 2; 
            double qua = (b * b);
            double ret = (a * b);

            Locale.setDefault(Locale.US);

            System.out.printf("TRIANGULO: %.3f%n", tri); 
            System.out.printf("CIRCULO: %.3f%n", cir);   
            System.out.printf("TRAPEZIO: %.3f%n", tra); 
            System.out.printf("QUADRADO: %.3f%n", qua); 
            System.out.printf("RETANGULO: %.3f%n", ret);

            
            sc.close();

        }
    }  