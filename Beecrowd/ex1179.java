import java.util.Scanner;
public class ex1179 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] par = new int [5];
        int [] impar = new int [5];
        int n = 0;
        int m = 0;

        for (int i = 0; i < 15; i++){
            int valor = sc.nextInt();

            if (valor % 2 == 0){
                par[n] = valor;
                n++;

                if (n == 5){
                    for(int j = 0; j < 5;   j++){
                        System.out.println("par[" + j + "] = " + par[j]);
                    }
                    n = 0;
                }

            }else { 
                impar[m] = valor;
                m++;

                if(m == 5){
                    for (int j = 0; j < 5; j++){
                        System.out.println("impar[" + j + "] = " + impar[j]);
                    }
                    m = 0;
                }
            }
        }

        for(int j = 0; j < m; j++){
            System.out.println("impar[" + j + "] = " + impar[j]);
        }

        for(int j = 0; j < n; j++){
            System.out.println("par[" + j + "] = " + par[j]);
        }

        sc.close();
    }
    
}
