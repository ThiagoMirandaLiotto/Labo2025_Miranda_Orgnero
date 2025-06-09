package Recetas;

import java.util.ArrayList;

public class Plato_principal extends Plato{
    private int minCoccion;
    private int numComensales;

    public Plato_principal(String nombre, Dificultad dificultad, ArrayList<String> pasos, int minCoccion, int numComensales) {
            super(nombre, dificultad, pasos);
        this.minCoccion = minCoccion;
        this.numComensales = numComensales;
    }

    public int getMinCoccion() {
        return minCoccion;
    }

    public void setMinCoccion(int minCoccion) {
        this.minCoccion = minCoccion;
    }

    public int getNumComensales() {
        return numComensales;
    }

    public void setNumComensales(int numComensales) {
        this.numComensales = numComensales;
    }
}
