package personas;

import fechas.Fecha;

public class Profesor extends Persona{
    private int porcentajeDescuento;

    public Profesor(){
        this.porcentajeDescuento = 5;
    }
    public Profesor(String nombre, String apellido, int dni, Fecha fechaNacimiento, String direccion, int porcentajeDescuento) {
        super(nombre, apellido, dni, fechaNacimiento, direccion);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
