package control_calorias;

public class Plato {
    private String nombre;
    private String ingredientes;
    private int calorias;

    public Plato(String nombre, String ingredientes, int calorias) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}
