package sistema_bebidas;

public class BebidaAzucarada extends Bebida {
    private double azucar;

    public BebidaAzucarada(String nombre, double azucar, int stock) {
        super(nombre, stock);
        this.azucar = azucar;
    }
    public double getCoefPositividad() {
        return 1;
    }

    public double getCoefNegatividad() {
        return azucar * 10;
    }

    public double getAzucar() {
        return azucar;
    }
}
