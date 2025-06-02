package sistema_llamadas;

import fechas.Fecha;
import personas.Persona;

public class Empleado extends Persona {
    String pais;
    int telefono;


    public Empleado(String nombre, String apellido, int dni, Fecha fechaNacimiento, String direccion, String pais, int telefono) {
        super(nombre, apellido, dni, fechaNacimiento, direccion);
        this.pais = pais;
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
