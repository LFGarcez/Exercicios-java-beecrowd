import java.util.Locale;
import java.util.Scanner;

public class Ex1181 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int L = sc.nextInt();
        char T = sc.next().toUpperCase().charAt(0);
        double soma = 0;
        double media = 0;

        double [][] M = new double [12][12];     

        for(int i = 0; i <M.length; i++){
            for(int j = 0; j <M[i].length; j++){
                M[i][j] = sc.nextDouble();
            }
        }

        for(int j = 0; j < M[L].length; j++){
            soma += M[L][j];
        }
            if(T == 'S'){    
                System.out.printf("%.1f%n", soma); 
            }
            if(T == 'M'){
                media = soma / M[L].length;
                System.out.printf("%.1f%n", media);
            }
              
        sc.close();
    }
    
}