import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int horas = (N / 3600);

        int min = (N % 3600) / 60;

        int seg = (N % 3600) % 60; 

        System.out.println(horas + ":" + min + ":" + seg);

        sc.close();

    }
}
