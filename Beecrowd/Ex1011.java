

import java.util.Scanner;
import java.util.Locale;

    public class Ex1011 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double r = sc.nextDouble();
            
            double v = ((4/3.0) * 3.14159 * Math.pow(r,3));

            Locale.setDefault(Locale.US);

            System.out.printf("VOLUME = %.3f", v);

            sc.close();
            
        }
        
    }
