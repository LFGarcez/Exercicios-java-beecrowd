import java.util.Scanner;
public class Ex1038{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    
		int cod = sc.nextInt();
		int quant = 0;
		double total = 0;
		
		if(cod == 1){
		    quant = sc.nextInt();
		    total = (4.00 * quant);
		    System.out.printf("Total: R$ %.2f%n", total);
		}
		if(cod == 2){
		    quant = sc.nextInt();
		    total = (4.50 * quant);
		    System.out.printf("Total: R$ %.2f%n", total);
		}
		if(cod == 3){
		    quant = sc.nextInt();
		    total = (5.00 * quant);
		    System.out.printf("Total: R$ %.2f%n", total);
		}
		if(cod == 4){
		    quant = sc.nextInt();
		    total = (2.00 * quant);
		    System.out.printf("Total: R$ %.2f%n", total);
		}
		if(cod == 5){
		    quant = sc.nextInt();
		    total = (1.50 * quant);
		    System.out.printf("Total: R$ %.2f%n", total);
		}
		
		sc.close();
	}
}
