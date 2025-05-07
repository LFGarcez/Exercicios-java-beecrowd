import java.util.Scanner;
public class Ex1042 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int A, B, C;
        int menor, meio, maior;
     
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if (A < B && A < C){
            menor = A;
            if (B < C){
                meio = B;
                maior = C;
            } else{
                meio = C;
                maior = B;
            }
        } else if (B < A && B < C){
            menor = B;
            if (A < C){
                meio = A;
                maior = C;
            } else{
                meio = C;
                maior = A;
            }
        } else {
            menor = C;
            if (A < B){
                meio = A;
                maior = B;
            } else{
                meio = B;
                maior = A;
            }
        }

        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);

        System.out.println();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        sc.close();
    }    
}
