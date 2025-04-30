import java.util.Scanner;

public class Ex1018 {   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int valor = sc.nextInt();
        int notas;

        System.out.println(valor);

        notas = valor / 100;
        System.out.println(notas + " nota (s) de R$ 100,00");
        valor %= 100;

        notas = valor / 50;
        System.out.println(notas + " nota (s) de R$ 50,00");
        valor %= 50; 
        
        notas = valor / 20;
        System.out.println(notas + " nota (s) de R$ 20,00");
        valor %= 20;

        notas = valor / 10;
        System.out.println(notas + " nota (s) de R$ 10,00");
        valor %= 10;

        notas = valor / 5;
        System.out.println(notas + " nota (s) de R$ 5,00");
        valor %= 5;

        notas = valor / 2;
        System.out.println(notas + " nota (s) de R$ 2,00");
        valor %= 2;

        notas = valor / 1;
        System.out.println(notas + " nota (s) de R$ 1,00");
        valor %= 1;

        sc.close();
    }
}
