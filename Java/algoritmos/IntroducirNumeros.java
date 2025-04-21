package algoritmos;

import java.util.Scanner;

public class IntroducirNumeros {
    public static void main(String[] args) {
        int numeros = -1;

        System.out.println("Ingresar numeros: ");
        boolean x = true;
        while(x){
            Scanner e = new Scanner(System.in);
            int num = e.nextInt();
            numeros++;

            if(num == -1){
                x = false;
            }
        }

        System.out.println("Ingreso " + numeros + " numeros.");
    }
}
