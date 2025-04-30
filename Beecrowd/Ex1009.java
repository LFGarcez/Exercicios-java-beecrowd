

import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String nome = sc.nextLine();
        double sal = sc.nextDouble();
        double montante = sc.nextDouble();

        double TOTAL = sal + (montante * 0.15);

        Locale.setDefault(Locale.US);
        System.out.printf("TOTAL = R$ %.2f", TOTAL);
        System.out.println();

        sc.close();

    }
}