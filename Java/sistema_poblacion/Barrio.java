package sistema_poblacion;

import java.util.HashSet;

public class Barrio extends Lugar{
    private int poblacion;

    public Barrio(String nombre, int cod, HashSet<Coordenada> contorno) {
        super(nombre, cod, contorno);
    }


    public int getPoblacion() {return poblacion;}
    public void setPoblacion(int poblacion) {this.poblacion = poblacion;}

    @Override
    public int calcularPoblacion(){
        return poblacion;
    }

}
