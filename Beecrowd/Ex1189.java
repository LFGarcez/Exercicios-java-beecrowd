import java.util.Locale;
import java.util.Scanner;

public class Ex1189 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        char O = sc.next().toUpperCase().charAt(0);
        
        double soma = 0;
        double media = 0;
        
        double [][] M = new double[12][12];
        int cont = 0;

        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M[i].length; j++){
                M[i][j] = sc.nextDouble();
            }
        }

        double N = M.length;

        for(int i = 0; i < M.length; i++){
            for (int j = 0; j < M[i].length; j++){
                if(j < i && j < N / 2 && i + j < N - 1){
                    soma += M[i][j];
                    cont ++;
                }
            }
        }

        if(O == 'S'){
            System.out.printf("%.1f%n", soma);
        }
        
        if(O == 'M'){
            media = soma / cont;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}    

