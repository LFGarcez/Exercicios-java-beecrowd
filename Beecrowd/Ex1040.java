import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        int cont = 0;

        for(int i = 0; i < 6; i++){
            double N = sc.nextDouble();
            if(N > 0){
                cont++;
            }
        }

        System.out.println(cont + " valores positivos");

        sc.close();
    }   
    
}
