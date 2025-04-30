

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double peso1 = 2;
        double peso2 = 3;
        double peso3 = 5;


        double MEDIA = (A * peso1 + B * peso2 + C * peso3) / (peso1 + peso2 + peso3);

        Locale.setDefault(Locale.US);

        System.out.printf("MEDIA = %.1f", MEDIA);
        System.out.printf("\n\n");

        sc.close();
    
    }
}