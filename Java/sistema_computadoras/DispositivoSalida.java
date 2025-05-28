package sistema_computadoras;

public class DispositivoSalida extends Componente{
    private int puertos;

    public DispositivoSalida(String nombre, String fabricante, String modelo, double precio, int stock, int puertos) {
        super(nombre, fabricante, modelo, precio, stock);
        this.puertos = puertos;
    }

    public int getPuertos() {
        return puertos;
    }
    public void setPuertos(int puertos) {
        this.puertos = puertos;
    }
}
