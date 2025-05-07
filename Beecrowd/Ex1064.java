import java.util.Locale;
import java.util.Scanner;

public class Ex1064 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        double soma = 0;
        double n;

        for (int i = 0; i < 6; i++) {
            n = sc.nextDouble();
            if (n > 0) {
                soma += n;
                cont++;
            }
        }
        System.out.println(cont + " valores positivos");

        double media = soma / cont;

        System.out.printf("%.1f%n", media);

        sc.close();
    }

}
