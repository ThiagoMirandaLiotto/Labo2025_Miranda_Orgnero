package arco_y_flecha;

public class DianaRectangular extends Diana{
    private int altura;
    private int base;

    @Override
    public double calcular_area() {
        return this.altura * this.base;
    }
}
