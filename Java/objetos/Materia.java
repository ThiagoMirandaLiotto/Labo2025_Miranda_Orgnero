package objetos;

import personas.Alumno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Materia {
    private String materia;
    private ArrayList<String> listaDeContenidos = new ArrayList<String>();
    private ArrayList<Alumno> alumnosInscriptos = new ArrayList<Alumno>();


    public void promedioEdadAlumnos(){
        int suma = 0;
        for(Alumno alumno : alumnosInscriptos){
            suma += alumno.calcularEdad();
        }

        System.out.println("Promedio de edad de los alumnos: " + suma/alumnosInscriptos.size());
    }



    public ArrayList<Alumno> getAlumnosInscriptos() {return alumnosInscriptos;}
    public String getMateria() {return materia;}
    public ArrayList<String> getListaDeContenidos() {return listaDeContenidos;}
    public void setMateria(String materia) {this.materia = materia;}
    public void setListaDeContenidos(ArrayList<String> listaDeContenidos) {this.listaDeContenidos = listaDeContenidos;}
    public void setAlumnosInscriptos(ArrayList<Alumno> alumnosInscriptos) {this.alumnosInscriptos = alumnosInscriptos;}

    public Materia(String materia, ArrayList<String> listaDeContenidos, ArrayList<Alumno> alumnoInscriptos){
        this.materia = materia;
        this.listaDeContenidos = listaDeContenidos;
        this.alumnosInscriptos = alumnoInscriptos;
    }
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("contenido1");
        lista.add("contenido2");
        lista.add("contenido3");

        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(new Alumno());
        alumnos.add(new Alumno());
        alumnos.add(new Alumno());

        Materia materia = new Materia("materia",lista, alumnos);
    }
}

