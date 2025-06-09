package Recetas;

import java.util.ArrayList;

public class Plato_entrada extends Plato{
    private temperatura hotIce;

    public Plato_entrada(String nombre, Dificultad dificultad, ArrayList<String> pasos, temperatura hotIce) {
        super(nombre, dificultad, pasos);
        this.hotIce = hotIce;
    }

    public temperatura getHotIce() {
        return hotIce;
    }

    public void setHotIce(temperatura hotIce) {
        this.hotIce = hotIce;
    }
}

