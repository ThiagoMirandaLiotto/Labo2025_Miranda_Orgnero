/*

package algoritmos;

import personas.Persona;

import java.util.ArrayList;

public class OperacionesBasicas {
    public static void main(String[] args) {
        //A:
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(771);
        numeros.add(15);
        numeros.add(441);
        numeros.add(142);
        numeros.add(1575);

        int suma = 0;
        for(int numero : numeros){
            suma += numero;
        }

        System.out.println("La suma de los ejercicios es: " + suma);


        //B:
        System.out.println(" ");
        ArrayList<String> palabras = new ArrayList<String>();

        palabras.add("Palabra");
        palabras.add("Palabra2");
        palabras.add("aPalabra");
        palabras.add("bPalabra");
        palabras.add("cPalabra");

        System.out.println("Palabras con a letra P:");
        for(String palabra : palabras){
            if(palabra.startsWith("P") || palabra.startsWith("p")){
                System.out.println(palabra);
            }
        }

        //C:
        System.out.println(" ");
        ArrayList<Persona> personas= new ArrayList<Persona>();

        personas.add(new Persona());
        personas.add(new Persona("Thiago", 17, "Macedonio Fernandez 2873"));
        personas.add(new Persona("Pipe", 17, "911 "));
        personas.add(new Persona("mauricio", 62, "Kahdgsdurdjkshiu"));
        personas.add(new Persona("fernandito", 31, "uaoryskjdyrald"));

        System.out.println("Personas de mas de 30 años");
        for(Persona persona : personas){
            if(persona.getEdad() > 30){
                persona.mostrarDatos();
            }
        }
    }
}

*/
