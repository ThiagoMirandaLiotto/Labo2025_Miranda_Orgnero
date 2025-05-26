package sistemaAlmuerzos;

import fechas.Fecha;
import personas.Persona;
import personas.Profesor;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema_pedidos {
    private ArrayList<Pedido> pedidos;


    public Sistema_pedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void eliminarPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }


    public void platosDia(Fecha fecha) {
        for (Pedido Ipedido : pedidos) {
            if (Ipedido.getFecha_crecion().equals(fecha)) {
                Persona solicitante = Ipedido.getSolicitante();

                for (Plato Iplato : Ipedido.getPlatos()) {
                    double precioOriginal = Iplato.getPrecio();
                    double precioFinal = precioOriginal;

                    // Si es un profesor, aplicar descuento
                    if (solicitante instanceof Profesor) {
                        Profesor profe = (Profesor) solicitante;
                        int descuento = profe.getPorcentajeDescuento();
                        precioFinal = precioOriginal - (precioOriginal * descuento / 100.0);
                    }

                    System.out.println("Nombre: " + Iplato.getNombre() + " - Precio final: $" + precioFinal);
                }
            }
        }
    }


    public void topPlatos() {
        ArrayList<String> nombresPlatos = new ArrayList<>();
        ArrayList<Integer> conteos = new ArrayList<>();

        // Contar la cantidad de veces que aparece cada plato
        for (int i = 0; i < pedidos.size(); i++) {
            Pedido pedido = pedidos.get(i);
            ArrayList<Plato> platosPedido = pedido.getPlatos();

            for (int j = 0; j < platosPedido.size(); j++) {
                Plato plato = platosPedido.get(j);
                String nombrePlato = plato.getNombre();

                boolean encontrado = false;
                for (int k = 0; k < nombresPlatos.size(); k++) {
                    if (nombresPlatos.get(k).equals(nombrePlato)) {
                        int nuevoConteo = conteos.get(k) + 1;
                        conteos.set(k, nuevoConteo);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    nombresPlatos.add(nombrePlato);
                    conteos.add(1);
                }
            }
        }
        System.out.println("== Top 3 Platos Más Pedidos ==");
        for (int i = 0; i < 3; i++) {
            int maxIndex = -1;
            int maxValor = -1;

            for (int j = 0; j < conteos.size(); j++) {
                if (conteos.get(j) > maxValor) {
                    maxValor = conteos.get(j);
                    maxIndex = j;
                }
            }

            if (maxIndex != -1) {
                System.out.println((i + 1) + ". " + nombresPlatos.get(maxIndex) + " - Pedidos: " + conteos.get(maxIndex));
                // Marcamos como usado
                conteos.set(maxIndex, -1);
            }
        }

    }

}
