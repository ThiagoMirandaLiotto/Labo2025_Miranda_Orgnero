package arco_y_flecha;


public class DianaCircular extends Diana{
    private static int radioCm = 13;

    @Override
    public double calcular_area() {
        return Math.PI * this.radioCm * this.radioCm;
    }
}
