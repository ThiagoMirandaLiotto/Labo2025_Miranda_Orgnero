package sistema_bebidas;

public class BebidaNeutra extends Bebida {
    private double coefPos, coefNeg;

    public BebidaNeutra(String nombre, double coefPos, double coefNeg) {
        super(nombre);
        this.coefPos = coefPos;
        this.coefNeg = coefNeg;
    }

    public double getCoefPositividad() {
        return coefPos;
    }

    public double getCoefNegatividad() {
        return coefNeg;
    }
}
