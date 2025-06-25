package sistema_bebidas;

import java.util.ArrayList;

public class SistemaBebidas {
    private ArrayList<Persona> personas;
    private ArrayList<Bebida> bebidas;

    public SistemaBebidas() {
        personas = new ArrayList<>();
        bebidas = new ArrayList<>();
    }

    public void agregarPersona(Persona p) {
        for (Persona per : personas) {
            if (per.getDni() == p.getDni()) {
                System.out.println("DNI duplicado. No se agrega la persona.");
                return;
            }
        }
        personas.add(p);
    }

    public void agregarBebida(Bebida b) {
        bebidas.add(b);
    }

    public Persona mejorCoeficiente() {
        if (personas.isEmpty()) return null;
        Persona mejor = personas.get(0);
        for (Persona p : personas) {
            if (p.getCoefHidratacion() > mejor.getCoefHidratacion()) {
                mejor = p;
            }
        }
        return mejor;
    }

    public Persona peorCoeficiente() {
        if (personas.isEmpty()) return null;
        Persona peor = personas.get(0);
        for (Persona p : personas) {
            if (p.getCoefHidratacion() < peor.getCoefHidratacion()) {
                peor = p;
            }
        }
        return peor;
    }

    public void registrarConsumo(int dni, String nombreBebida, int cantidad) {
        Persona persona = null;
        for (Persona p : personas) {
            if (p.getDni() == dni) {
                persona = p;
                break;
            }
        }

        Bebida bebida = null;
        for (Bebida b : bebidas) {
            if (b.getNombre().equalsIgnoreCase(nombreBebida)) {
                bebida = b;
                break;
            }
        }

        if (persona != null && bebida != null) {
            persona.registrarConsumo(bebida, cantidad);
        } else {
            System.out.println("Persona o bebida no encontrada.");
        }
    }
}