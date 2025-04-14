package unidad_0;

import java.util.Scanner;

public class ReemplazarLetra {
    public static void main(String[] args) {
        String frase = "Ayer me compré muñecos de la marca ‘ToyCo’ por internet.";

        System.out.println("Ingrese una letra");
        Scanner e = new Scanner(System.in);
        String letra = e.nextLine();

        String frase2 = frase.replace('e', letra.charAt(0));

        System.out.println(frase2);

    }
}
