package arco_y_flecha;

import java.util.HashSet;

public class BeneficioGaseosa extends Beneficio implements BeneficioAcumulable{
    private HashSet<String> gaseosas;

    public BeneficioGaseosa(int nombre, String usuario, HashSet<String> gaseosas) {
        super(nombre, usuario);
        this.gaseosas = gaseosas;
    }

    @Override
    public int aplicarDescuentoExta() {
        return 1000;
    }

    @Override
    public boolean esAcumulable() {
        return false;
    }
}
