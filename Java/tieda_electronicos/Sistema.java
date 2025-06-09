package tieda_electronicos;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Producto> productos;

    public Sistema(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto){
        productos.remove(producto);
    }

    public void modificarProducto(Producto viejoProducto, Producto nuevoProducto){
        productos.remove(viejoProducto);
        productos.add(nuevoProducto);
    }

    public Producto mayorStock(){
        Producto producto = productos.get(0);
        int mayorStock = productos.get(0).getStock();
        for(Producto p : productos){
            if(p.getStock() > mayorStock){
                mayorStock = p.getStock();
                producto = p;
            }
        }
        return producto;
    }

    public Producto menorStock(){
        Producto producto = productos.get(0);
        int menorStock = productos.get(0).getStock();

        for(Producto p : productos){
            if(p.getStock() < menorStock){
                menorStock = p.getStock();
                producto = p;
            }
        }

        return producto;
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema(new ArrayList<>());

        ArrayList<Producto> p1 = new ArrayList<>();
        Sonido auriculares = new Sonido("auriculares",  1213.0, 3, true);
        Televisor samsungB30 = new Televisor("tele", 1213.0, 4, Tecnologia.FULLHD ,24);
        CargadorPortatil C1 = new CargadorPortatil("cargador", 1213.0, 10, 234);

        sistema.agregarProducto(auriculares);
        sistema.agregarProducto(samsungB30);
        sistema.agregarProducto(C1);

        System.out.println(sistema.mayorStock().getNombre());
        System.out.println(sistema.menorStock().getNombre());
    }
}
