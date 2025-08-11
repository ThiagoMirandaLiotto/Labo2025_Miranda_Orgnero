package pago_empleados;

public class Proyecto {
    private String nombre_proyecto;
    private int plata;

    public Proyecto(String nombre_proyecto, int plata) {
        this.nombre_proyecto = nombre_proyecto;
        this.plata = plata;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }
}
