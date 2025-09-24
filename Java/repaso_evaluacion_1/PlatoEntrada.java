package repaso_evaluacion_1;

import java.util.HashMap;
import java.util.HashSet;

public class PlatoEntrada {
    private HashMap<String, Integer> ingredientes;
    private int tiempo;

    public PlatoEntrada(HashMap<String, Integer> ingredientes, int tiempo) {
        this.ingredientes = ingredientes;
        this.tiempo = tiempo;
    }

    public HashMap<String, Integer> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashMap<String, Integer> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
