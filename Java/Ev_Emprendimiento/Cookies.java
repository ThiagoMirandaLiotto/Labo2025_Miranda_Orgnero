package EvaluacionesInterface.Ev_Emprendimiento;

public class Cookies extends Preparacion implements Vendible{
    private int bicarbonato;
    private Topping topping;

    public Cookies(int harina, int azucar, int manteca, int huevos, int stock, double precio, int bicarbonato, Topping topping) {
        super(harina, azucar, manteca, huevos, stock, precio);
        this.bicarbonato = bicarbonato;
        this.topping = topping;
    }

    @Override
    public String conocerReceta(){
        return "Empeza partiendo el chocolate";
    }

    @Override
    public void actualizarStock(int cantVentas) throws StockInsuficienteException{
        if (super.getStock() >= cantVentas){
            restarStock(cantVentas);
            System.out.println("Stock suficiente");
        }else{
            throw new StockInsuficienteException("No hay stock suficiente");
        }
    }

    @Override
    public void descripcion(){
        System.out.println("Animate a probar las mejores cookies del mercado");
    }
    @Override
    public double calcularPrecio(int cantVenta){
        return super.getPrecio()*cantVenta;
    }

    @Override
    public double vender(int cant){
       this.actualizarStock(cant);
       return this.calcularPrecio(cant);
    }

}
