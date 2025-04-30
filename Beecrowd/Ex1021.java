import java.util.Scanner;

public class Ex1021{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();

        int centavos = (int) Math.round(N * 100);
 
        int quantidade;

        System.out.println("NOTAS:");

        quantidade = (centavos/10000);
        System.out.printf("%d nota(s) de R$ 100.00 %n", quantidade); 
        centavos %= 10000;

        quantidade = (centavos/5000);
        System.out.printf("%d nota(s) de R$ 50.00 %n", quantidade); 
        centavos %= 5000;

        quantidade = (centavos/2000);
        System.out.printf("%d nota(s) de R$ 20.00 %n", quantidade); 
        centavos %= 2000;

        quantidade = (centavos/1000);
        System.out.printf("%d nota(s) de R$ 10.00 %n", quantidade); 
        centavos %= 1000;

        quantidade = (centavos/500);
        System.out.printf("%d nota(s) de R$ 5.00 %n", quantidade); 
        centavos %= 500;

        quantidade = (centavos/200);
        System.out.printf("%d nota(s) de R$ 2.00 %n", quantidade); 
        centavos %= 200;

        System.out.println("MOEDAS:");

        quantidade = (centavos/100);
        System.out.printf("%d moeda(s) de R$ 1.00 %n", quantidade); 
        centavos %= 100;

        quantidade = (centavos/50);
        System.out.printf("%d moeda(s) de R$ 0.50 %n", quantidade); 
        centavos %= 50;

        quantidade = (centavos/25);
        System.out.printf("%d moeda(s) de R$ 0.25 %n", quantidade); 
        centavos %= 25;

        quantidade = (centavos/10);
        System.out.printf("%d moeda(s) de R$ 0.10 %n", quantidade); 
        centavos %= 10;

        quantidade = (centavos/5);
        System.out.printf("%d moeda(s) de R$ 0.05 %n", quantidade); 
        centavos %= 5;

        quantidade = (centavos/1);
        System.out.printf("%d moeda(s) de R$ 0.01 ", quantidade); 
        centavos %= 1;


        sc.close();
    }
}