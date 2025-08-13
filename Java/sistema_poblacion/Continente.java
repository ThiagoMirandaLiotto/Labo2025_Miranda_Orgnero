package sistema_poblacion;

import java.util.HashSet;

public class Continente extends Lugar{
    HashSet<Pais> Paises;

    public Continente(String nombre, int cod, HashSet<Coordenada> contorno) {
        super(nombre, cod, contorno);
    }

    public Pais paisConMenorPoblacion(){
        int p = 0;
        Pais pais = null;
        for (Pais c : Paises){
            if (c.calcularPoblacion() < p){
                p = c.calcularPoblacion();
                pais = c;
            }
        }
        return pais;
    }
    public Pais paisConMayorPoblacion(){
        int p = 0;
        Pais pais = null;
        for (Pais c : Paises){
            if (c.calcularPoblacion() > p){
                p = c.calcularPoblacion();
                pais = c;
            }
        }
        return pais;
    }
    @Override
    public int calcularPoblacion(){
        int poblacion = 0;
        for (Pais p: Paises){
            poblacion += p.calcularPoblacion();
        }
        return poblacion;
    }
}
