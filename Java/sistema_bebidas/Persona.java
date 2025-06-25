package sistema_bebidas;

import java.util.ArrayList;

public class Persona {
    private String nombre, apellido;
    private int dni;
    private ArrayList<Consumo> consumos;

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.consumos = new ArrayList<>();
    }

    public void registrarConsumo(Bebida bebida, int cantidad) {
        consumos.add(new Consumo(bebida, cantidad));
    }

    public double getCoefHidratacion() {
        double total = 0;
        for (Consumo c : consumos) {
            total += c.getCoeficiente();
        }
        return total;
    }

    public int getDni() {
        return dni;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public ArrayList<Consumo> getConsumos() {
        return consumos;
    }
}
