package fragmento_codigo;

public class Throw {
    public static void main(String[] args) {
        String nombre = null;

        try {
            if (nombre == null) {
                throw new NullPointerException("El nombre no puede ser null");
            }
            System.out.println("El largo del nombre es: " + nombre.length());
        } catch (NullPointerException e) {
            System.err.println("Error: El nombre no puede ser null. " + e);
        }finally {
            System.out.println("Firma: thiago miranda liotto");
        }
    }
}
