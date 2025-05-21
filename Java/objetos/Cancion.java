package objetos;

import personas.Persona;

public class Cancion {
    String titulo;
    Persona autor;


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Persona getAutor() {
        return autor;
    }
    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public Cancion(){
        this.titulo = "";
        this.autor = new Persona();
    }

    public Cancion(String titulo, Persona autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}
