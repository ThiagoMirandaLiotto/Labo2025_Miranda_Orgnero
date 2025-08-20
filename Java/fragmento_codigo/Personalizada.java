package fragmento_codigo;

public class Personalizada {
    public static void longitudNombre(String nombre) throws nombreInexistenteException {
        if(nombre == null){
            throw new nombreInexistenteException("Erorr: El nombre no puede ser null.");
        }else{
            System.out.println("Longitud del nombre: " + nombre.length());
        }
    }


    public static void main(String[] args) {
        String nombre = null;
        try{
            longitudNombre(nombre);
        } catch (nombreInexistenteException e) {
            e.printStackTrace();
            e.getMessage();
        }finally {
            System.out.println("Firma: thiago miranda liotto");
        }
    }
}
