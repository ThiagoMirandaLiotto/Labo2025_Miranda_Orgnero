package personas;

import fechas.Fecha;
import objetos.Materia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona{
    private ArrayList<Integer> listaDeNotas = new ArrayList<Integer>();
    private ArrayList<Materia> materias = new ArrayList<Materia>();

    public void agregarMateria(String materia, ArrayList<String> listaDeContenidos, ArrayList<Alumno> alumnosInscriptos){
        materias.add(new Materia(materia, listaDeContenidos, alumnosInscriptos));
    }

    public void promedioNotas(){
        int suma = 0;
        for(int nota : listaDeNotas){
            suma += nota;
        }

        System.out.println("Promedio de las notas del alumno: " + suma/listaDeNotas.size());
    }

    void agregarNota(int nota){
        listaDeNotas.add(nota);
    }

    void menorNota(){
        int menorNota = listaDeNotas.getFirst();
        for(int nota : listaDeNotas){
            if(nota < menorNota){
                menorNota = nota;
            }
        }
        System.out.println(menorNota);
    }

    void mayorNota(){
        int mayorNota = listaDeNotas.getFirst();
        for(int nota : listaDeNotas){
            if(nota > mayorNota){
                mayorNota = nota;
            }
        }
        System.out.println(mayorNota);
    }

    public int calcularEdad(){
        int anio = LocalDate.now().getYear();
        int edad = super.getFechaNacimiento().getAnio() - anio;

        return edad;
    }

    public ArrayList<Integer> getListaDeNotas() {
        return listaDeNotas;
    }
    public void setListaDeNotas(ArrayList<Integer> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }

    public Alumno(){
        super();
        this.listaDeNotas = new ArrayList<Integer>();
    }
    public Alumno(String nombre, String apellido, int DNI, Fecha fechaDeNacimiento, String direccion, ArrayList<Integer> listaDeNotas) {
        super(nombre, apellido, DNI ,fechaDeNacimiento, direccion);
        this.listaDeNotas = listaDeNotas;
    }


    public static void main(String[] args) {
        // Lista de notas
        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(3);
        notas.add(8);
        notas.add(6);
        notas.add(9);
        notas.add(8);
        notas.add(6);
        notas.add(5);

        // Crear alumnos
        Alumno alumno1 = new Alumno("Juan", "Pérez", 48232512, new Fecha(15, 5, 2005), "macedonio 1241", notas);
        Alumno alumno2 = new Alumno("Ana", "García", 48236542, new Fecha(22, 7, 2004), "tusuegra 2714", notas);
        Alumno alumno3 = new Alumno("Luis", "Martínez", 41136142, new Fecha(30, 9, 2006), "Dueña 2124", notas);

        ArrayList<Alumno> alumnosInscriptos = new ArrayList<>();
        alumnosInscriptos.add(alumno1);
        alumnosInscriptos.add(alumno2);
        alumnosInscriptos.add(alumno3);

        ArrayList<String> contenidos = new ArrayList<>();
        contenidos.add("Programación");
        contenidos.add("Algoritmos");
        contenidos.add("Estructuras de Datos");

        // Crear materia y agregarla al alumno
        Materia materia = new Materia("Programación", contenidos, alumnosInscriptos);
        alumno1.agregarMateria("Programación", contenidos, alumnosInscriptos);

        // Probar métodos
        alumno1.menorNota();
        alumno1.agregarNota(2);
        alumno1.menorNota();
        alumno1.mayorNota();
        alumno1.agregarNota(10);
        alumno1.mayorNota();
        alumno1.promedioNotas();

        System.out.println();
        materia.promedioEdadAlumnos();
    }
}