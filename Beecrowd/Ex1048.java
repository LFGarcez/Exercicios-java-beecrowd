import java.util.Scanner;
import java.util.Locale;

public class Ex1048 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double salario = sc.nextDouble();

        double ns;
        double ganho;

        if (salario >= 0 && salario <= 400.00) {
            ganho = salario * 0.15;
            ns = ganho + salario;
            System.out.printf("Novo salario: %.2f%n", ns);
            System.out.printf("Reajuste ganho: %.2f%n", ganho);
            System.out.println("Em percentual: 15 %");
        }
        if (salario >= 400.01 && salario <= 800.00) {
            ganho = salario * 0.12;
            ns = ganho + salario;
            System.out.printf("Novo salario: %.2f%n", ns);
            System.out.printf("Reajuste ganho: %.2f%n", ganho);
            System.out.println("Em percentual: 12 %");
        }
        if (salario >= 800.01 && salario <= 1200.00) {
            ganho = salario * 0.10;
            ns = ganho + salario;
            System.out.printf("Novo salario: %.2f%n", ns);
            System.out.printf("Reajuste ganho: %.2f%n", ganho);
            System.out.println("Em percentual: 10 %");
        }
        if (salario >= 1200.01 && salario <= 2000.00) {
            ganho = salario * 0.07;
            ns = ganho + salario;
            System.out.printf("Novo salario: %.2f%n", ns);
            System.out.printf("Reajuste ganho: %.2f%n", ganho);
            System.out.println("Em percentual: 7 %");
        }
        if (salario > 2000.00) {
            ganho = salario * 0.04;
            ns = ganho + salario;
            System.out.printf("Novo salario: %.2f%n", ns);
            System.out.printf("Reajuste ganho: %.2f%n", ganho);
            System.out.println("Em percentual: 4 %");
        }

        sc.close();
    }
}