import java.util.Scanner;
import java.util.Locale;

public class Ex1174 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double [] a = new double[100];

        for (int i=0; i<a.length; i++){
            a[i] = sc.nextDouble();
        }

        Locale.setDefault(Locale.US);
        
        for (int i = 0; i<100; i++){
            if(a[i] < 10){
                System.out.printf("A[%d] =  %.1f%n",i, a[i]);
            }
        }

        sc.close();
    } 
    
}
