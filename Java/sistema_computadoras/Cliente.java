package sistema_computadoras;

import fechas.Fecha;
import personas.Persona;

public class Cliente extends Persona {
    private int celular;
    private MetodoPago metodoPago;


    public Cliente(String nombre, String apellido, int dni, Fecha fechaNacimiento, String direccion, int celular, MetodoPago metodoPago) {
        super(nombre, apellido, dni, fechaNacimiento, direccion);
        this.celular = celular;
        this.metodoPago = metodoPago;
    }
}
