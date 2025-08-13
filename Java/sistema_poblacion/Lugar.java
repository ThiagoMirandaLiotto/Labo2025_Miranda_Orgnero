package sistema_poblacion;

import java.util.HashSet;

public abstract class Lugar {
    String nombre;
    int cod;
    HashSet<Coordenada> contorno;

    public Lugar(String nombre, int cod, HashSet<Coordenada> contorno) {
        this.nombre = nombre;
        this.cod = cod;
        this.contorno = contorno;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getCod() {return cod;}
    public void setCod(int cod) {this.cod = cod;}
    public HashSet<Coordenada> getContorno() {return contorno;}public void setContorno(HashSet<Coordenada> contorno) {this.contorno = contorno;}


    public abstract int calcularPoblacion();
}
