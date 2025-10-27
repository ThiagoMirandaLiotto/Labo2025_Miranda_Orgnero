package EvaluacionesInterface.Ev_Emprendimiento;

public class Brownies extends Preparacion implements Vendible{
    private int chocolate;

    public Brownies(int harina, int azucar, int manteca, int huevos, int stock, double precio, int chocolate) {
        super(harina, azucar, manteca, huevos, stock, precio);
        this.chocolate = chocolate;
    }

    @Override
    public String conocerReceta(){
        return "Derretí la manteca";
    }

    @Override
    public void actualizarStock(int cantVentas){
        if (super.getStock() >= cantVentas){
            restarStock(cantVentas);
            System.out.println("Stock suficiente");
        }else{
            throw new StockInsuficienteException("No hay stock suficiente");
        }
    }

    @Override
    public void descripcion(){
        System.out.println("Brownies bien húmedos");
    }
    @Override
    public double calcularPrecio(int cantCompra){
        return super.getPrecio()*cantCompra;
    }

    @Override
    public double vender(int cant){
        this.actualizarStock(cant);
        return this.calcularPrecio(cant);
    }
}
