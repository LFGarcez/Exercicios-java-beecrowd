import java.util.Scanner;
public class Ex1146{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            
            if(n == 0){
                System.out.println(" ");
                break;

            }
        
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }

        System.out.println();
    }
            
        sc.close();
    }
}