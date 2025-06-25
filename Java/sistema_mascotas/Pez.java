package sistema_mascotas;

public class Pez extends Mascota {
    private int vidas = 10;

    public Pez(String nombre, String duenio) {
        super(nombre, duenio);
    }

    @Override
    public String saludar() {
        return "";
    }
    @Override
    public String saludoExtraño(){
        return "";
    }
    @Override
    public void alimentar() {
        if (vidas > 0) vidas++;
    }

    public boolean estaMuerto() {
        return vidas <= 0;
    }

    @Override
    public String tipo() {
        return "Pez";
    }
}
