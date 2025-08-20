package sistema_mascotas;

public class Pez extends Mascota {
    private int vidas = 10;

    public Pez(String nombre, String duenio) {
        super(nombre, duenio);
    }

    @Override
    public String saludarNormal() {
        return "";
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public String saludarNormal(String duenio, String nombre) {
        String noSaludo = "";
        if (duenio.equals(getDuenio())){
            --vidas;
        }
        else {
            vidas = 0;
        }
        return noSaludo;
    }
    @Override
    public String saludarNoDuenio() {
        String saludoExtraño = "";

        return saludoExtraño;

    }

    @Override
    public void alimentar() {
        if (vidas > 0) {
            vidas++;
        }
    }

    public boolean estaMuerto() {
        return vidas <= 0;
    }

    @Override
    public String tipo() {
        return "Pez";
    }
}
