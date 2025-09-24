package repaso_evaluacion_1;

import java.time.LocalDate;

public abstract class Participante {
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private String localidad;
    private Equipo equipo;


    public Participante(String nombre, String apellido, LocalDate nacimiento, String localidad, Equipo equipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.localidad = localidad;
        this.equipo = equipo;
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
    public LocalDate getNacimiento() {
        return nacimiento;
    }
    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public abstract void prepararLugar();
}
