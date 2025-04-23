package curso;

public class Clothing {
    private String descripcion;
    private double precio;
    private String talla = "L";


    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getTalla() {
        return talla;
    }
    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Clothing(String descripcion, double precio, String talla){
        this.descripcion = descripcion;
        this.precio = precio;
        this.talla = talla;
    }


    public static void main(String[] args) {

    }
}

