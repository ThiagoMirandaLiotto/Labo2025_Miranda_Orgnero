package sistema_computadoras;

public class Impresora extends DispositivoSalida{
    private String metodoImpresion;

    public Impresora(String nombre, String fabricante, String modelo, double precio, int stock, int puertos, String metodoImpresion) {
        super(nombre, fabricante, modelo, precio, stock, puertos);
        this.metodoImpresion = metodoImpresion;
    }

    public String getMetodoImpresion() {
        return metodoImpresion;
    }
    public void setMetodoImpresion(String metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}
