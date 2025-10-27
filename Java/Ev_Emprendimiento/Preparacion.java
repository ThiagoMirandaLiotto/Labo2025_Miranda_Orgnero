package EvaluacionesInterface.Ev_Emprendimiento;

abstract public class Preparacion {
    private int harina;
    private int azucar;
    private int manteca;
    private int huevos;
    private int stock;
    private double precio;

    public int getHarina() {
        return harina;
    }
    public void setHarina(int harina) {
        this.harina = harina;
    }
    public int getAzucar() {
        return azucar;
    }
    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }
    public int getManteca() {
        return manteca;
    }
    public void setManteca(int manteca) {
        this.manteca = manteca;
    }
    public int getHuevos() {
        return huevos;
    }
    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Preparacion(int harina, int azucar, int manteca, int huevos, int stock, double precio) {
        this.harina = harina;
        this.azucar = azucar;
        this.manteca = manteca;
        this.huevos = huevos;
        this.stock = stock;
        this.precio = precio;
    }

    public abstract String conocerReceta();

    public void sumarStock(int cant){
        this.stock += cant;
    }
    public void restarStock(int cant){
        this.stock -= cant;
    }
}
