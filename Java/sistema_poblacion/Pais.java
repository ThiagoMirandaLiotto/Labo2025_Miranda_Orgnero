package sistema_poblacion;

import java.util.HashSet;

public class Pais extends Lugar{
    HashSet<Provincia> provincias;

    public Pais(String nombre, int cod, HashSet<Coordenada> contorno) {
        super(nombre, cod, contorno);
    }


    @Override
    public int calcularPoblacion(){
        int poblacion = 0;
        for (Provincia p: provincias){
            poblacion += p.calcularPoblacion();
        }
        return poblacion;
    }
}
