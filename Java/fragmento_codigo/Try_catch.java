package fragmento_codigo;

public class Try_catch {
    public class Main {
        public static void main(String[] args) {
            String nombre = null;

            try {
                System.out.println("El largo del nombre es: " + nombre.length());
            } catch (NullPointerException e) {
                System.out.println("Error: el nombre es null");
            }

            System.out.println("Firma: Juan Pérez");
        }
    }
}
