import java.util.Scanner;
import java.util.Locale;

public class Ex1178 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double [] N = new double [100];

        double X = sc.nextDouble(); 
        
        N[0] = X;
        for (int i = 1; i < N.length; i++){
            N[i] = N[i - 1] / 2;
        }

        Locale.setDefault(Locale.US);

        for (int i = 0; i < N.length; i++){
            System.out.printf("N[%d] = %.4f%n", i, N[i]);
        }

        sc.close();
    }
}
