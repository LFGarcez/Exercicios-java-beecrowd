import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int  d = sc.nextInt();

    // 1 km leva 2 min.
    // numero de km vezes 2 min.

    int tempo = (d*2);

    System.out.println(tempo + " minutos");

    sc.close();

    }
    
}