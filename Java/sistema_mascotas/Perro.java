package sistema_mascotas;

public class Perro extends Mascota {
    private int alegria = 0;

    public Perro(String nombre, String duenio) {
        super(nombre, duenio);
    }

    @Override
    public String saludar() {
        String saludoBase = "guau";
        return saludoBase;
    }
    @Override
    public String saludoExtraño(){
        return "GUAU!";
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

