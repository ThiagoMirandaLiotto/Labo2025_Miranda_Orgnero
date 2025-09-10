package arco_y_flecha;

import java.util.HashMap;

public abstract class Diana {
    private String nombre;
    private String dificultad;
    private HashMap<Integer, Color> puntaje;

    public Diana() {
        this.nombre = "diana";
        this.dificultad = "facil";
        this.puntaje = new HashMap<>();
    }

    public Diana(String nombre, String dificultad, HashMap<Integer, Color> puntaje) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.puntaje = puntaje;
    }

    public abstract double calcular_area();
    public int cantidadPuntajes(){
        return puntaje.size();
    }
}
