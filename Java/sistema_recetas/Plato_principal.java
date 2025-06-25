package sistema_recetas;

import java.util.ArrayList;

public class Plato_principal extends Receta {
    private int minCoccion;
    private int numComensales;
    private Tipo tipo = Tipo.PRINCIPAL;

    public Plato_principal(String nombre, Dificultad dificultad, ArrayList<String> pasos, int minCoccion, int numComensales) {
            super(nombre, dificultad, pasos);
        this.minCoccion = minCoccion;
        this.numComensales = numComensales;
    }

    @Override
    public Tipo getTipo() {
        return tipo;
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


    @Override
    void mostrarInstrucciones() {
        System.out.println("Esta receta tarda en cocinarse " + minCoccion + " minutos. Y los pasos son: ");
        for(String p : getPasos()){
            System.out.println(p);
        }
    }
}
