package sistema_bebidas;

public class BebidaAlcoholica extends Bebida {
    private double alcohol;

    public BebidaAlcoholica(String nombre, double alcohol) {
        super(nombre);
        this.alcohol = alcohol;
    }

    public double getCoefPositividad() {
        return 0;
    }

    public double getCoefNegatividad() {
        return alcohol * 20;
    }

    public double getAlcohol() {
        return alcohol;
    }
}