package fragmento_codigo;

public class Throws {
    public static void longitudNombre(String nombre) throws NullPointerException{
        System.out.println("El largo del nombre es: " + nombre.length());
    }
    public static void main(String[] args){
        String nombre = "null";

        try {
            longitudNombre(nombre);
        } catch (NullPointerException e) {
            System.err.println("Error: El nombre no puede ser null. " + e);
        }finally {
            System.out.println("Firma: thiago miranda liotto");
        }
    }
}
