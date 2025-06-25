package tienda_electronicos;

public class Televisor extends Producto{
    private Tecnologia tecnologia;
    private int pixeles;


    public Televisor(String nombre, double precio, int stock, Tecnologia tecnologia, int pixeles) {
        super(nombre, precio, stock, Seccion.MULTIMEDIA);
        this.tecnologia = tecnologia;
        this.pixeles = pixeles;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }
    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }
    public int getPixeles() {
        return pixeles;
    }
    public void setPixeles(int pixeles) {
        this.pixeles = pixeles;
    }
}
