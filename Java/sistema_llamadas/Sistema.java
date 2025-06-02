package sistema_llamadas;

import fechas.Fecha;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Empleado> empleados;
    private ArrayList<Llamada> llamadas;

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public void registrarEmpleado(Empleado e) {
        empleados.add(e);
    }


    public Sistema() {
        empleados = new ArrayList<>();
        llamadas = new ArrayList<>();
    }

    public Empleado buscarPorTelefono(int telefono) {
        for (Empleado e : empleados) {
            if (e.getTelefono() == telefono) {
                return e;
            }
        }
        return null;
    }

    public void registrarLlamada(int telOrigen, int telDestino, Fecha fecha, int duracion) {
        Empleado origen = buscarPorTelefono(telOrigen);
        Empleado destino = buscarPorTelefono(telDestino);

        llamadas.add(new Llamada(origen, destino, fecha, duracion));
    }

    public void mostrarLlamadasDeEmpleado(int dni) {
        System.out.println("Llamadas hechas por el empleado con DNI " + dni + ":");
        for (Llamada l : llamadas) {
            if (l.getOrigen().getDni() == dni) {
                System.out.println(l);
            }
        }
    }

    public void rankingLlamadasExterior() {
        System.out.println("Ranking de empleados que más llamaron al exterior:");
        for (Empleado e : empleados) {
            int totalExterior = 0;
            for (Llamada l : llamadas) {
                if (l.getOrigen().equals(e) &&
                        !l.getOrigen().getPais().equals(l.getDestino().getPais())) {
                    totalExterior += l.getDuracion();
                }
            }
            if (totalExterior > 0) {
                System.out.println(e.getNombre() + ": " + totalExterior + " min al exterior");
            }
        }
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        Empleado e1 = new Empleado("nombre1", "apellido1", 1, new Fecha(10, 5, 1990), "Direccion1", "Argentina", 1111);
        Empleado e2 = new Empleado("nombre2", "apellido2", 2, new Fecha(15, 8, 1992), "Direccion2", "Chile", 2222);
        Empleado e3 = new Empleado("nombre3", "apellido3", 3, new Fecha(10, 5, 1990), "Direccion3", "Argentina", 3333);

        sistema.registrarEmpleado(e1);
        sistema.registrarEmpleado(e2);
        sistema.registrarEmpleado(e3);

        sistema.registrarLlamada(1111, 2222, new Fecha(20, 3, 2025), 10);
        sistema.registrarLlamada(1111, 3333, new Fecha(20, 3, 2025), 5);
        sistema.registrarLlamada(3333, 2222, new Fecha(21, 3, 2025), 8);

        sistema.mostrarLlamadasDeEmpleado(1);

        sistema.rankingLlamadasExterior();
    }
}
