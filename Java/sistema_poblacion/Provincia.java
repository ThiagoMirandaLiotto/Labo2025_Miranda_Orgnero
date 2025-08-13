package sistema_poblacion;

import java.util.HashSet;

public class Provincia extends Lugar{
    HashSet<Ciudad> ciudades;

    public Provincia(String nombre, int cod, HashSet<Coordenada> contorno) {
        super(nombre, cod, contorno);
    }


    @Override
    public int calcularPoblacion(){
        int poblacion = 0;
        for (Ciudad c: ciudades){
            poblacion += c.calcularPoblacion();
        }
        return poblacion;
    }
}
