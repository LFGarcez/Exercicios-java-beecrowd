

import java.util.Scanner;
import java.util.Locale;

public class Ex1010 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        //Peça 1
        //int cod1 = sc.nextInt();
        int num1 = sc.nextInt();
        double vunit1 = sc.nextDouble();

        //peça 2
        //int cod2 = sc.nextInt();
        int num2 = sc.nextInt();
        double vunit2 = sc.nextDouble();

        //valor a ser pago
        double total = (num1 * vunit1 + num2 * vunit2);

        Locale.setDefault(Locale.US);
        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        System.out.println();

        sc.close();

    } 
}
