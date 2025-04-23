package curso;

public class Customer {
    private String nombre;



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public Customer(String nombre){
        this.nombre = nombre;
    }
    public Customer(){
        this.nombre = "Nombre";
    }


    public static void main(String[] args) {

    }
}
