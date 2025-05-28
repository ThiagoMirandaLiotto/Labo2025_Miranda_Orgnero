package sistema_computadoras;

public class Compra {
    private Cliente cliente;
    private Computadora computadora;

    public Compra(Cliente cliente, Computadora computadora) {
        this.cliente = cliente;
        this.computadora = computadora;
    }

    public Computadora getComputadora() {
        return computadora;
    }
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
