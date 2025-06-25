package sistema_bebidas;

public class Consumo {
    private Bebida bebida;
    private int cantidad;

    public Consumo(Bebida bebida, int cantidad) {
        this.bebida = bebida;
        this.cantidad = cantidad;
    }

    public double getCoeficiente() {
        return cantidad * (bebida.getCoefPositividad() - bebida.getCoefNegatividad());
    }

    public Bebida getBebida() {
        return bebida;
    }

    public int getCantidad() {
        return cantidad;
    }
}
