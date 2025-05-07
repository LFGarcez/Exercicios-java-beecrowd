import java.util.Scanner;
import java.util.Locale;

public class Ex1041{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Origem");
        }
        if(y == 0 && x != 0){
            System.out.println("Eixo X");
        }
        if(x == 0 && y != 0){
            System.out.println("Eixo Y");
        }
        if(x > 0 && y > 0){
            System.out.println("Q1");
        }
        if(x < 0 && y > 0){
            System.out.println("Q2");
        }
        if(x < 0 && y < 0){
            System.out.println("Q3");
        }
        if(x > 0 && y < 0){
            System.out.println("Q4");
        }

        sc.close();
    }    
}
