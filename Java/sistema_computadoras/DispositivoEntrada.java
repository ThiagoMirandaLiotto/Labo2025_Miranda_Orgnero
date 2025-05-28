package sistema_computadoras;

public class DispositivoEntrada extends Componente{
    private String tipoConector;
    private int puertos;

    public DispositivoEntrada(String nombre, String fabricante, String modelo, double precio, int stock, String tipoConector, int puertos) {
        super(nombre, fabricante, modelo, precio, stock);
        this.tipoConector = tipoConector;
        this.puertos = puertos;
    }

    public String getTipoConector() {
        return tipoConector;
    }
    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }
    public int getPuertos() {
        return puertos;
    }
    public void setPuertos(int puertos) {
        this.puertos = puertos;
    }
}
