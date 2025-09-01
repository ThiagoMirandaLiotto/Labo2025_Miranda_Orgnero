package sistema_bebidas;

public abstract class Bebida {
    private String nombre;
    private int stock;

    public Bebida(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public void reducirStock(int cantidad) throws BebidaNoDisponibleException {
        if (cantidad > stock) {
            throw new BebidaNoDisponibleException(
                    "No hay suficiente stock de " + nombre + ". Disponible: " + stock
            );
        }
        stock -= cantidad;
    }

    public abstract double getCoefPositividad();
    public abstract double getCoefNegatividad();
}