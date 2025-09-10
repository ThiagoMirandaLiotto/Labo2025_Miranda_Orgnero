package arco_y_flecha;

import java.util.HashSet;

public class BeneficioComida extends Beneficio implements BeneficioAcumulable{
    private HashSet<String> comidas;

    public BeneficioComida(int nombre, String usuario, HashSet<String> comidas) {
        super(nombre, usuario);
        this.comidas = comidas;
    }

    @Override
    public int aplicarDescuentoExta() {
        return 4500;
    }

    @Override
    public boolean esAcumulable() {
        return false;
    }
}
