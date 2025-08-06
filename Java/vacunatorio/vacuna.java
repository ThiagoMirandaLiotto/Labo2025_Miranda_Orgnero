package vacunatorio;
import java.time.LocalDate;

public class vacuna {
    private LocalDate fecha;
    private LocalDate fecha_aplicacion;
    private int lote;
    private int num_fabricacion;
    private String comercial;

    //GETTERS Y SETTERS
    public LocalDate getFecha() {return fecha;}
    public void setFecha(LocalDate fecha) {this.fecha = fecha;}
    public LocalDate getFecha_aplicacion() {return fecha_aplicacion;}
    public void setFecha_aplicacion(LocalDate fecha_aplicacion) {this.fecha_aplicacion = fecha_aplicacion;}
    public int getLote() {return lote;}
    public void setLote(int lote) {this.lote = lote;}
    public int getNum_fabricacion() {return num_fabricacion;}
    public void setNum_fabricacion(int num_fabricacion) {this.num_fabricacion = num_fabricacion;}
    public String getComercial() {return comercial;}
    public void setComercial(String comercial) {this.comercial = comercial;}
}
