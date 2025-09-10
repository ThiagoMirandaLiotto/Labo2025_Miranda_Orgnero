package arco_y_flecha;

import java.util.HashSet;

public class BeneficioTragos extends Beneficio {
    private HashSet<String> tragos;

    public BeneficioTragos(int nombre, String usuario, HashSet<String> tragos) {
        super(nombre, usuario);
        this.tragos = tragos;
    }

    public HashSet<String> getTragos() {
        return tragos;
    }

    public void setTragos(HashSet<String> tragos) {
        this.tragos = tragos;
    }

    @Override
    public boolean esAcumulable() {
        return true;
    }
}
