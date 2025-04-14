package unidad_0;

import java.util.Scanner;

public class ingresodatos {

    public static void main(String[] args) {
    int N;
    double A;
    char C;
    
    Scanner e = new Scanner(System.in);
        System.out.println("Ingresar un entero: ");
        N = e.nextInt();
        System.out.println("Ingresar un double: ");
        A = e.nextDouble();
        System.out.println("Ingresar un char: ");
        C = (e.nextLine()).charAt(0);

        System.out.println(N);
        System.out.println(A);
        System.out.println(C);

        System.out.println(N+A);
        System.out.println(A-N);
    }
}

