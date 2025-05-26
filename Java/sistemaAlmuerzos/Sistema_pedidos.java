package sistemaAlmuerzos;

import fechas.Fecha;
import personas.Persona;

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

    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public void eliminarPedido(Pedido pedido){
        pedidos.remove(pedido);
    }



    public void platosDia(Fecha fecha){
        for (Pedido Ipedido : pedidos){
            if (Ipedido.getFecha_crecion().equals(fecha)){
                for (Plato Iplatos: Ipedido.getPlatos())
                    System.out.println("Nombre: " + Iplatos.getNombre() + "Precio: " + Iplatos.getPrecio());
            }
        }
    }


    public void topPlatos(){
        for(Pedido p : pedidos){
            for(Plato pp : p.getPlatos()){

            }
        }
    }
}
