package personas;

import fechas.Fecha;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private Fecha fechaNacimiento;
    private String direccion;



    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + ", fechaNacimiento: " + fechaNacimiento + ", Direccion: " + direccion);
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDireccion() {
        return direccion;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
        this.nombre = "sin nombre";
        this.fechaNacimiento = new Fecha(1, 1, 2000);
        this.direccion = "sin direccion";
    }

    public Persona(String nombre, String apellido, int dni, Fecha fechaNacimiento, String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
}
