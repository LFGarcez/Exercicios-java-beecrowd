import java.util.Scanner;
public class Ex1046{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hi = sc.nextInt();
		int hf = sc.nextInt();
		
		if(hi >= hf){
		
		    int tempo = hf + (24 - hi);
		
		    System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
		
		} else if(hi <= hf){
		
		    int tempo = hf - hi;
		
		    System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
		}
		
		sc.close();
	}
}
