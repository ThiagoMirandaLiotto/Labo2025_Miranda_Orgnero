package sistema_llamadas;

import fechas.Fecha;
import sistema_llamadas.Empleado;

public class Llamada {
    private Empleado origen;
    private Empleado destino;
    private Fecha fecha;
    private int duracion; // en minutos

    public Llamada(Empleado origen, Empleado destino, Fecha fecha, int duracion) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public Empleado getOrigen() {
        return origen;
    }
    public Empleado getDestino() {
        return destino;
    }
    public Fecha getFecha() {
        return fecha;
    }
    public int getDuracion() {
        return duracion;
    }

    public void setOrigen(Empleado origen) {
        this.origen = origen;
    }

    public void setDestino(Empleado destino) {
        this.destino = destino;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
