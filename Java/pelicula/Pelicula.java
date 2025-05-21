package pelicula;

import personas.EmpleadoBanco;

import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private String genero;
    private int duracion;
    private ArrayList<EmpleadoBanco> directores;
    private ArrayList<EmpleadoBanco> actores;
    private ArrayList<EmpleadoBanco> idiomasDisponibles;

    public Pelicula() {
        this.nombre = "";
        this.genero = "";
        this.duracion = 0;
        this.directores = new ArrayList<>();
        this.actores = new ArrayList<>();
        this.idiomasDisponibles = new ArrayList<>();
    }
    public Pelicula(String nombre, String genero, int duracion, ArrayList<EmpleadoBanco> directores, ArrayList<EmpleadoBanco> actores, ArrayList<EmpleadoBanco> idiomasDisponibles) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.directores = directores;
        this.actores = actores;
        this.idiomasDisponibles = idiomasDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<EmpleadoBanco> getDirectores() {
        return directores;
    }

    public void setDirectores(ArrayList<EmpleadoBanco> directores) {
        this.directores = directores;
    }

    public ArrayList<EmpleadoBanco> getActores() {
        return actores;
    }

    public void setActores(ArrayList<EmpleadoBanco> actores) {
        this.actores = actores;
    }

    public ArrayList<EmpleadoBanco> getIdiomasDisponibles() {
        return idiomasDisponibles;
    }

    public void setIdiomasDisponibles(ArrayList<EmpleadoBanco> idiomasDisponibles) {
        this.idiomasDisponibles = idiomasDisponibles;
    }
    public String mostrarInfo(){
        return nombre + " " + duracion + "min";
    }

    //punto c: actores mayores de edad
    public ArrayList<EmpleadoBanco> actoresMayoresDeEdad(){
        ArrayList<EmpleadoBanco> actoresMayoresDeEdad = new ArrayList<>();
        for (EmpleadoBanco p: actores){
            if (p.esMayorDeEdad()){
                actoresMayoresDeEdad.add(p);
            }
        }
        return actoresMayoresDeEdad;
    }
}
