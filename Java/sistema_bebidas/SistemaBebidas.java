package sistema_bebidas;

import java.util.ArrayList;

public class SistemaBebidas {
    private ArrayList<Persona> personas;
    private ArrayList<Bebida> bebidas;

    public SistemaBebidas() {
        personas = new ArrayList<>();
        bebidas = new ArrayList<>();
    }

    public void agregarPersona(Persona p) throws DniDuplicadoException {
        for (Persona per : personas) {
            if (per.getDni() == p.getDni()) {
                throw new DniDuplicadoException("El DNI " + p.getDni() + " ya está registrado.");
            }
        }
        personas.add(p);
    }

    public void agregarBebida(Bebida b) {
        bebidas.add(b);
    }

    public Persona mejorCoeficiente() throws NoHayPersonasException {
        if (personas.isEmpty()) {
            throw new NoHayPersonasException("No hay personas registradas en el sistema.");
        }
        Persona mejor = personas.get(0);
        for (Persona p : personas) {
            if (p.getCoefHidratacion() > mejor.getCoefHidratacion()) {
                mejor = p;
            }
        }
        return mejor;
    }

    public Persona peorCoeficiente() throws NoHayPersonasException {
        if (personas.isEmpty()) {
            throw new NoHayPersonasException("No hay personas registradas en el sistema.");
        }
        Persona peor = personas.get(0);
        for (Persona p : personas) {
            if (p.getCoefHidratacion() < peor.getCoefHidratacion()) {
                peor = p;
            }
        }
        return peor;
    }

    public void registrarConsumo(int dni, String nombreBebida, int cantidad) throws BebidaNoDisponibleException {
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

        if (persona == null) {
            throw new BebidaNoDisponibleException("La persona con DNI " + dni + " no existe.");
        }
        if (bebida == null) {
            throw new BebidaNoDisponibleException("La bebida '" + nombreBebida + "' no existe en el sistema.");
        }

        bebida.reducirStock(cantidad); //si no hay suficiente stock saa la exception
        persona.registrarConsumo(bebida, cantidad);
    }
}