package curso;

public class Shop {
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0.0;
        Customer cliente = new Customer();

        cliente.setNombre("Nombre");
        System.out.println("Nombre del cliente:" + cliente.getNombre());

        Clothing ropa1 = new Clothing("Campera azul", 20.9, "M");
        Clothing ropa2 = new Clothing("Remera naranja", 10.5, "S");

        System.out.println("Objeto 1: " + ropa1.getDescripcion() + ", precio:" + ropa1.getPrecio() + ", talle:" + ropa1.getTalla());
        System.out.println("Objeto 2: " + ropa2.getDescripcion() + ", precio:" + ropa2.getPrecio() + ", talle:" + ropa2.getTalla());

        total = (ropa1.getPrecio() + (ropa2.getPrecio()*2)*(1+tax));
        System.out.println("Total: " + total);
    }
}
