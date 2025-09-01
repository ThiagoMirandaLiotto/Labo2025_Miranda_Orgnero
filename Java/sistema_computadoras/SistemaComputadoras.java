package sistema_computadoras;

import java.util.ArrayList;

public class SistemaComputadoras {
    private ArrayList<Computadora> computadoras;
    private ArrayList<Computadora> computadorasVendidas;

    public SistemaComputadoras() {
        computadoras = new ArrayList<>();
        computadorasVendidas = new ArrayList<>();
    }

    public void registrarComputadora(Computadora c) {
        computadoras.add(c);
    }

    public void venderComputadora(Cliente cliente, Computadora computadora) throws SinStockException {
        // Controlar stock de CPU
        computadora.getCPU().reducirStock();

        // Controlar stock de dispositivos de entrada
        for (DispositivoEntrada d : computadora.getDispositivosEntrada()) {
            d.reducirStock();
        }

        // Controlar stock de dispositivos de salida
        for (DispositivoSalida d : computadora.getDispositivosSalida()) {
            d.reducirStock();
        }

        computadorasVendidas.add(computadora);
        System.out.println("Compra realizada con éxito por " + cliente.getNombre());
    }
}
