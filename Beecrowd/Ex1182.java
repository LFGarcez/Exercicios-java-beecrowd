import java.util.Locale;
import java.util.Scanner;

public class Ex1182{
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        int T = sc.next().toUpperCase().charAt(0);

        double soma = 0;
        double media = 0;
        double [][] M = new double[12][12];

        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M[i].length; j++){
                M[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < M[C].length; i++){
            soma += M[i][C];
        }

        if (T == 'S'){
            System.out.printf("%.1f%n", soma);
        }
        if (T == 'M'){
            media = soma / M[C].length;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}