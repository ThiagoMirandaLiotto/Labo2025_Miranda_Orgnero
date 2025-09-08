package eleccionesOctubre;

import java.time.LocalTime;

public class Trabajador implements Mensajero {
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaNacimiento;
    private String cuil;
    private double sueldo;
    private String direccion;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Trabajador(String nombre, String apellido, String dni, String fechaNacimiento,
                      String cuil, double sueldo, String direccion,
                      LocalTime horaInicio, LocalTime horaFin) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.cuil = cuil;
        this.sueldo = sueldo;
        this.direccion = direccion;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        LocalTime ahora = LocalTime.now();
        if (ahora.isAfter(horaInicio) && ahora.isBefore(horaFin)) {
            System.out.println("Yo, " + nombre + " " + apellido + " te invito a que... " + mensaje);
        } else {
            System.out.println("El trabajador " + nombre + " no está en horario laboral.");
        }
    }
}
