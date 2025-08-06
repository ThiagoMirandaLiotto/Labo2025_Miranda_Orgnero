package sistema_mascotas;

public class Pajarito extends Mascota {
    private boolean cantor;
    private String canto = "pio";
    private int alegria = 0;

    public Pajarito(String nombre, String duenio, boolean cantor, String canto) {
        super(nombre, duenio);
        this.cantor = cantor;
        this.canto = canto;
    }

    @Override
    public String saludarNormal() {
        String saludoBase = "pio";

        return saludoBase;

    }
    @Override
    public String saludarNoDuenio() {
        String saludoExtraño = "";

        return saludoExtraño;

    }


    @Override
    public void alimentar() {
        alegria++;
    }

    @Override
    public String tipo() {
        return "Pajarito";
    }
}
