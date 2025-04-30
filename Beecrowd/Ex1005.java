

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double peso1 = 3.5;
        double peso2 = 7.5;

        double MEDIA = (A * peso1 + B * peso2) / (peso1 + peso2);

        Locale.setDefault(Locale.US);

        System.out.printf("MEDIA = %.5f", MEDIA);
        System.out.printf("\n\n");

        sc.close();
        
    }
}
