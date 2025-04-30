

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int horas = sc.nextInt();
        double vh = sc.nextDouble();
        
        double SALARY = (horas * vh);

        System.out.println("NUMBER = " + num);

        Locale.setDefault(Locale.US);
        System.out.printf("SALARY = U$ %.2f", SALARY);

        sc.close();

    }
}
