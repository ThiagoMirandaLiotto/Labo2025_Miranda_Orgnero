package sistema_mascotas;

public abstract class Mascota {
    private String nombre;
    private String duenio;

    public Mascota(String nombre, String duenio) {
        this.nombre = nombre;
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public abstract String saludar();
    public abstract String saludoExtraño();
    public abstract void alimentar();
    public abstract String tipo();
}
