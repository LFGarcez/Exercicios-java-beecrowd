import java.util.Scanner;

public class Ex1049 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();
        String C = sc.nextLine();

        if (A.equals("vertebrado")) {
            if (B.equals("ave")) {
                if (C.equals("carnivoro")) {
                    System.out.println("aguia");

                } else if (C.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (B.equals("mamifero")) {
                if (C.equals("onivoro")) {
                    System.out.println("homem");

                } else if (C.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (A.equals("invertebrado")) {
            if (B.equals("inseto")) {

                if (C.equals("hematofago")) {
                    System.out.println("pulga");

                } else if (C.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (B.equals("anelideo")) {

                if (C.equals("hematofago")) {
                    System.out.println("sanguessuga");

                } else if (C.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
    }
}