package arco_y_flecha;

import java.util.HashMap;

public abstract class Diana {
    private String nombre;
    private String dificultad;
    private HashMap<Integer, Color> puntaje;



    public abstract double calcular_area();
}
