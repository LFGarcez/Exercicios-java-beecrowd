import java.util.Locale;
import java.util.Scanner;

public class Ex1043 {
    public static void main(String args []){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
         
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double area = 0;
        double perimetro = 0;

        if (A+B > C && A+C > B && B+C > A){
            perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);

        } else{
            area =  (A + B) * C / 2;
            System.out.printf("Area = %.1f%n", area);
        }

        sc.close();
    }    
}
