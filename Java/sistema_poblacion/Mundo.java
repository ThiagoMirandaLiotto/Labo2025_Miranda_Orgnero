package sistema_poblacion;

import java.util.HashSet;

public class Mundo extends Lugar{
    HashSet<Continente> continentes;
    HashSet<Lugar> lugares;

    public Mundo(String nombre, int cod, HashSet<Coordenada> contorno) {
        super(nombre, cod, contorno);
    }


    public void agregarLugar(Lugar l){
        lugares.add(l);
    }
    public void eliminarLugar(Lugar l){
        lugares.remove(l);
    }
    public void modificarLugar(Lugar viejoLugar, Lugar nuevoLugar){
        for (Lugar l : lugares){
            if (l.getCod() == viejoLugar.getCod()){
                lugares.remove(viejoLugar);
                lugares.add(nuevoLugar);
            }
        }
        lugares.remove(viejoLugar);
    }

    public int consultarPoblacion(int codigo){
        for (Lugar l: lugares){
            if (l.getCod() == codigo){
                return l.calcularPoblacion();
            }
        }
        System.out.println("No hay ningun lugar con ese codigo");
        return codigo;
    }
    public Continente continenteConMayorPoblacion(){
        int p = 0;
        Continente cont = null;
        for (Continente c : continentes){
            if (c.calcularPoblacion() > p){
                p = c.calcularPoblacion();
                cont = c;
            }
        }
        return cont;
    }
    public Continente continenteConMenorPoblacion(){
        int p = 0;
        Continente cont = null;
        for (Continente c : continentes){
            if (c.calcularPoblacion() < p){
                p = c.calcularPoblacion();
                cont = c;
            }
        }
        return cont;
    }
    @Override
    public int calcularPoblacion(){
        int poblacion = 0;
        for (Continente c: continentes){
            poblacion += c.calcularPoblacion();
        }
        return poblacion;
    }
}
