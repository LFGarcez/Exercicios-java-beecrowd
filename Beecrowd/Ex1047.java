import java.util.Scanner;
public class Ex1047{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hi = sc.nextInt();
        int mini = sc.nextInt();
		int hf = sc.nextInt();
        int minf = sc.nextInt();
		
        int inicio = (hi * 60) + mini;
        int fim = (hf * 60) + minf;
        int tempo;
        int H;
        int Min;

        if(inicio < fim){
            tempo = fim - inicio;
        }else{
            tempo = (24 * 60 - inicio) + fim;
        }

            H = tempo / 60;
            Min = tempo % 60;

		    System.out.println("O JOGO DUROU " + H + " HORA(S) E " + Min + " MINUTO(S)");
		
		
		sc.close();
	}
}