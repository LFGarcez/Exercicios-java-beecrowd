import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        double y = sc.nextDouble();
        
        double total = (x/y);

        System.out.printf("%.4f km/l%n", total);

        sc.close();
    }
}


