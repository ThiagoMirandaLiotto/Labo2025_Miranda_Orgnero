package fragmento_codigo;

public class Throw {
    public class Main {
        public static void main(String[] args) {
            String nombre = null;

            if (nombre == null) {
                throw new NullPointerException("El nombre no puede ser null");
            }

            System.out.println("El largo del nombre es: " + nombre.length());
            System.out.println("Firma: Juan Pérez");
        }
    }
}
