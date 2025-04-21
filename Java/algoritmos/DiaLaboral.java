package algoritmos;

import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        String diasLaborales[] = {"lunes", "martes", "miercoles", "mueves", "miernes"};

        System.out.println("Ingresar un dia: ");
        Scanner e = new Scanner(System.in);
        String dia = e.nextLine();

        boolean x = false;
        for(int i = 0; i < diasLaborales.length; i++){
            if(dia.toLowerCase().equals(diasLaborales[i])){
                x = true;
            }
        }

        if(x){
            System.out.println("Si es dia laboral");
        }else{
            System.out.println("No es dia laboral");
        }
    }
}
