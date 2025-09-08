package arco_y_flecha;

import java.util.HashSet;

public class BeneficioComida extends Beneficio implements BeneficioAcumulable{
    private HashSet<String> comidas;
    @Override
    public int aplicarDescuentoExta() {
        return 4500;
    }
}
