package tieda_electronicos;

public class CargadorPortatil extends Producto{
    private int cargas;


    public CargadorPortatil(String nombre, double precio, int stock, int cargas) {
        super(nombre, precio, stock, Seccion.CARGADORES);
        this.cargas = cargas;
    }

    public int getCargas() {
        return cargas;
    }

    public void setCargas(int cargas) {
        this.cargas = cargas;
    }
}
