import java.util.Locale;
import java.util.Scanner;

public class Ex1037 {
    public static void main(String args []){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double N = sc.nextDouble();

        if(N >= 0 && N <= 25){
            System.out.println("Intervalo [0,25]");
        }
        if(N > 25 && N <= 50){
            System.out.println("Intervalo (25,50]");
        }
        if(N > 50 && N <= 75){
            System.out.println("Intervalo (50,75]");
        }
        if(N > 75 && N <= 100){
            System.out.println("Intervalo (75,100]");
        }
        if(N < 0 || N > 100){
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
