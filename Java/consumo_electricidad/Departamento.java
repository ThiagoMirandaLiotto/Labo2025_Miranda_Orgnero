package consumo_electricidad;

public class Departamento extends Vivienda {
    private int ambientes;
    private static int precio = 5000;

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    public Departamento(String direccion, int cod, Duenio duenio, int ambientes) {
        super(direccion, cod, duenio);
        this.ambientes = ambientes;
    }

    @Override
    public int cuantoPagar() {
        return 0;
    }
}
