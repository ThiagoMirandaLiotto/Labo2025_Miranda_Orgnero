package arco_y_flecha;


import java.util.HashMap;

public class DianaCircular extends Diana{
    private static int radioCm = 13;

    public DianaCircular() {
    }

    public DianaCircular(String nombre, String dificultad, HashMap<Integer, Color> puntaje) {
        super(nombre, dificultad, puntaje);
    }

    public static int getRadioCm() {
        return radioCm;
    }

    public static void setRadioCm(int radioCm) {
        DianaCircular.radioCm = radioCm;
    }

    @Override
    public double calcular_area() {
        return Math.PI * this.radioCm * this.radioCm;
    }
}
