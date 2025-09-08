package arco_y_flecha;

import java.util.HashSet;

public class BeneficioGaseosa extends Beneficio implements BeneficioAcumulable{
    private HashSet<String> gaseosas;

    @Override
    public int aplicarDescuentoExta() {
        return 1000;
    }
}
