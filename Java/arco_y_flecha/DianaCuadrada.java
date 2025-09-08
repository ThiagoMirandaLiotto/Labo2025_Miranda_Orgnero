package arco_y_flecha;

public class DianaCuadrada extends Diana{
    private int valorLados;

    @Override
    public double calcular_area() {
        return this.valorLados * this.valorLados;
    }
}
