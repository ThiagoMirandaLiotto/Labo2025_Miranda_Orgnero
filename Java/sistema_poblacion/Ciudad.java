package sistema_poblacion;

import java.util.HashSet;

public class Ciudad extends Lugar{
    HashSet<Barrio> barrios;

    public Ciudad(String nombre, int cod, HashSet<Coordenada> contorno) {
        super(nombre, cod, contorno);
    }


    @Override
    public int calcularPoblacion(){
        int poblacion = 0;
        for (Barrio b: barrios){
            poblacion += b.getPoblacion();
        }
        return poblacion;
    }
}
