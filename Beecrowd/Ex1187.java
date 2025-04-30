import java.util.Locale;
import java.util.Scanner;

public class Ex1187 {
    public static void main(String args []){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char O = sc.next().toUpperCase().charAt(0);
        
        int cont = 0;

        double media = 0;
        double soma = 0;
        
        double [][] M = new double [12][12];

        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M[i].length; j++){
                M[i][j] = sc.nextDouble();
            }
        }
        
        double N = M.length;

        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M[i].length; j++){
                if(j > i && j + i < N -1){
                    soma += M[i][j];
                    cont++;
                }
            }
        }
        
        if(O == 'S'){
            System.out.printf("%.1f%n", soma);
        }  

        if(O == 'M'){
            media = (soma / cont);
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
