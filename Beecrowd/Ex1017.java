import java.util.Scanner;
import java.util.Locale;

public class Ex1017 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double horas = sc.nextDouble();
        double kmh = sc.nextDouble();

        double litros = (horas*kmh)/12;

        Locale.setDefault(Locale.US);

        System.out.printf("%.3f%n", litros);

        sc.close();
    }
}
