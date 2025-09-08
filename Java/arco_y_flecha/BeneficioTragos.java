package arco_y_flecha;

import java.util.HashSet;

public class BeneficioTragos extends Beneficio {
    private HashSet<String> tragos;

    public HashSet<String> getTragos() {
        return tragos;
    }

    public void setTragos(HashSet<String> tragos) {
        this.tragos = tragos;
    }
}
