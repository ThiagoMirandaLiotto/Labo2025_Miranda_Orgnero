package sistema_bebidas;

public abstract class Bebida {
    private String nombre;

    public Bebida(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double getCoefPositividad();
    public abstract double getCoefNegatividad();
}