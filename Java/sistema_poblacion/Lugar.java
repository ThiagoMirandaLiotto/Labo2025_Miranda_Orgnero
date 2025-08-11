package sistema_poblacion;

import java.util.HashSet;

public abstract class Lugar {
    String nombre;
    int cod;
    HashSet<Coordenada> contorno;




    public abstract void calcularPoblacion();
}
