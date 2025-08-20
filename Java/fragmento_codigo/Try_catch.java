package fragmento_codigo;

public class Try_catch {
    public static void main(String[] args) {
        String nombre = null;
        try {
            System.out.println("El largo del nombre es: " + nombre.length());
        } catch (NullPointerException e) {
            System.err.println("Error: el nombre no puede ser null. " + e);
        }finally{
            System.out.println("Firma: thiago miranda liotto");
        }
    }
}
