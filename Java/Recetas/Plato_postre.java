package Recetas;

import java.util.ArrayList;

public class Plato_postre extends Plato{
    private int temperatura_horno;
    private boolean diabetico;


    public Plato_postre(String nombre, Dificultad dificultad, ArrayList<String> pasos, int temperatira, boolean diabetico) {
        super(nombre, dificultad, pasos);
        this.temperatura_horno = temperatira;
        this.diabetico = diabetico;
    }

    public int getTemperatura_horno() {
        return temperatura_horno;
    }

    public void setTemperatura_horno(int temperatura_horno) {
        this.temperatura_horno = temperatura_horno;
    }

    public boolean isDiabetico() {
        return diabetico;
    }

    public void setDiabetico(boolean diabetico) {
        this.diabetico = diabetico;
    }
}
