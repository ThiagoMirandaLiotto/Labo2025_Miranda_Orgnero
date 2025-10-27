package EvaluacionesInterface.Ev_Emprendimiento;

public interface Vendible {
    void actualizarStock(int cantVentas) throws StockInsuficienteException;
    void descripcion();
    double calcularPrecio(int cantCompra);
    double vender(int cant) throws StockInsuficienteException;
}
