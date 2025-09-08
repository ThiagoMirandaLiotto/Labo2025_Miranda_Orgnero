package eleccionesOctubre;

import java.util.ArrayList;

public class Partido {
    private String nombre;
    private String direccion;
    private int cantidadAfiliados;
    private ArrayList<Mensajero> mensajeros;

    public Partido(String nombre, String direccion, int cantidadAfiliados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadAfiliados = cantidadAfiliados;
        this.mensajeros = new ArrayList<>();
    }

    public void agregarMensajero(Mensajero m) {
        mensajeros.add(m);
    }

    public void hacerCampania() {
        for (Mensajero m : mensajeros) {
            m.enviarMensaje("Vote por el partido " + nombre + " para un mejor futuro.");
        }
    }
}
