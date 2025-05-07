import java .util.Scanner;
import java.util.Locale;

public class Ex1036 {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double delta = 0; 
        double R1 = 0;
        double R2 = 0;
        
        delta = Math.pow(B, 2) - 4 * (A * C);

       
        if(delta > 0 && delta != 0){
            R1 = (-B + Math.sqrt(delta)) / (2 * A);
            R2 = (-B - Math.sqrt(delta)) / (2 * A); 

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }else{
            System.out.println("Impossivel calcular");
        }

        sc.close();
    }
}
