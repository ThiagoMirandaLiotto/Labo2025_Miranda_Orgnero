package sistema_mascotas;

public class Perro extends Mascota {
    private int alegria = 0;

    public Perro(String nombre, String duenio) {
        super(nombre, duenio);
    }

    @Override
    public String saludarNormal() {
        String saludoBase = "guau";

        return saludoBase;

    }

    @Override
    public String saludarNormal(String duenio, String nombre) {
        return "";
    }

    @Override
    public String saludarNoDuenio() {
        String saludoExtraño = "GUAU";

        return saludoExtraño;

    }



    @Override
    public void alimentar() {
        alegria++;
    }

    @Override
    public String tipo() {
        return "Perro";
    }
}

