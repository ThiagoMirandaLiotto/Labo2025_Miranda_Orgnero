package personas;

import fechas.Fecha;

import java.time.LocalDate;

public class EmpleadoBanco extends Persona{
    private LocalDate fechaIngresoAlBanco;

    public EmpleadoBanco() {
        super();
        this.fechaIngresoAlBanco = LocalDate.now();
    }
    public EmpleadoBanco(String nombre, String apellido, int dni, Fecha fechaNacimiento, LocalDate fechaIngresoAlBanco) {
        super(nombre, apellido, dni, fechaNacimiento, "direccion");
        this.fechaIngresoAlBanco = fechaIngresoAlBanco;
    }
    //Se usa para dar de alta con la fecha de hoy a empleados.
    public EmpleadoBanco(String nombre, String apellido, int dni, Fecha fechaNacimiento) {
        super(nombre, apellido, dni, fechaNacimiento, "direccion");
        this.fechaIngresoAlBanco = LocalDate.now();
    }



    public int getDni() {
        return super.getDni();
    }

    public void setDni(int dni) {
        super.setDni(dni);
    }

    public Fecha getFechaNacimiento() {
        return super.getFechaNacimiento();
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        super.setFechaNacimiento(fechaNacimiento);
    }

    public LocalDate getFechaIngresoAlBanco() {
        return fechaIngresoAlBanco;
    }

    public void setFechaIngresoAlBanco(LocalDate fechaIngresoAlBanco) {
        this.fechaIngresoAlBanco = fechaIngresoAlBanco;
    }

    public int antiguedad(){
        return LocalDate.now().getYear() - fechaIngresoAlBanco.getYear();
    }

    public boolean esMayorDeEdad(){
        return (LocalDate.now().getYear()- getFechaNacimiento().getAnio()) > 18;
    }
}