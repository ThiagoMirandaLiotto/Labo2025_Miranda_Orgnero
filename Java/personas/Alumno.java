package personas;

import fechas.Fecha;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fechaDeNacimiento;
    private ArrayList<Integer> listaDeNotas = new ArrayList<Integer>();



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


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public Fecha getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public ArrayList<Integer> getListaDeNotas() {
        return listaDeNotas;
    }
    public void setListaDeNotas(ArrayList<Integer> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }

    public Alumno(){
        this.nombre = "alumnoNombre";
        this.apellido = "alumnoApellido";
        this.fechaDeNacimiento = new Fecha(20, 10, 2010);
        this.listaDeNotas = new ArrayList<Integer>();
    }
    public Alumno(String nombre, String apellido, Fecha fechaDeNacimiento, ArrayList<Integer> listaDeNotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.listaDeNotas = listaDeNotas;
    }


    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<Integer>();
        notas.add(3);
        notas.add(8);
        notas.add(6);
        notas.add(9);
        notas.add(8);
        notas.add(6);
        notas.add(5);

        Alumno alumno = new Alumno("Nombre", "Apellido", new Fecha(5, 10, 2024), notas);

        alumno.menorNota();
        alumno.agregarNota(2);
        alumno.menorNota();
        alumno.mayorNota();
        alumno.agregarNota(10);
        alumno.mayorNota();
    }
}
