import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble(); 
        double media = 0; 

        media = (N1*2 + N2*3 + N3*4 + N4*1) / (2.0+3.0+4.0+1.0);
        double mediaFormatada = (int) (media * 10) / 10.0;

        System.out.printf("Media: %.1f%n", mediaFormatada); 

        if(media >= 7.0){
            System.out.println("Aluno aprovado.");

        }else if(media >= 5.0 && media < 7.0){
            System.out.println("Aluno em exame.");

            double N5 = sc.nextDouble();

            System.out.printf("Nota do exame: %.1f%n", N5);

            double MF = (N5 + media) / 2;

            if(MF >= 5){
                System.out.println("Aluno aprovado.");

            }else{
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", MF); 
        }
        if(media > 0 && media < 5){
            System.out.println("Aluno reprovado.");
        }

        sc.close();
    }   
    
}
