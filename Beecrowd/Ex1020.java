import java.util.Scanner;

public class Ex1020 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        int ano = (idade / 365);

        int mes = (idade % 365) / 30;

        int dia = (idade % 365) % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        sc.close();
    }
    
}
