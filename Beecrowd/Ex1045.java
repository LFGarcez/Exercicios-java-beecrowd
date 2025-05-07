import java.util.Scanner;
import java.util.Locale;

public class Ex1045 {
    public static void main(String args []){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double maior, meio, menor;

        if (A >= B && A >= C){
            maior = A;
            if (B >= C){
                meio = B;
                menor = C;
            } else{
                meio = C;
                menor = B;
            }
        } else if (B >= A && B >= C){
            maior = B;
            if (A >= C){
                meio = A;
                menor = C;
            } else{
                meio = C;
                menor = A;
            }
        } else {
            maior = C;
            if (A >= B){
                meio = A;
                menor = B;
            } else{
                meio = B;
                menor = A;
            }
        }
            // A sempre é o maior

        if(maior >= meio + menor){
            System.out.println("NAO FORMA TRIANGULO");

        } else{
            if(Math.pow(maior,2) == Math.pow(meio,2) + Math.pow(menor, 2)){
                System.out.println("TRIANGULO RETANGULO");

            } else if(Math.pow(maior,2) > Math.pow(meio,2) + Math.pow(menor, 2)){
                System.out.println("TRIANGULO OBTUSANGULO");

            } else{
                System.out.println("TRIANGULO ACUTANGULO");
            }
        }
        
        if (maior == meio && meio == menor){
            System.out.println("TRIANGULO EQUILATERO");

        } else if(maior == meio || meio == menor || menor == maior){
            System.out.println("TRIANGULO ISOSCELES");
        }

        sc.close();
    }
}