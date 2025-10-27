package EvaluacionesInterface.Ev_Emprendimiento;

import java.util.HashMap;
import java.util.HashSet;

public class DesayunoApp {
    private HashSet<Preparacion> todasLasPreparaciones;
    private HashSet<Vendible> preparacionesVendibles;
    private HashMap<Preparacion, Integer> historialVentas;

    public DesayunoApp(HashSet<Preparacion> todasLasPreparaciones, HashSet<Vendible> preparacionesVendibles, HashMap<Preparacion, Integer> historialVentas) {
        this.todasLasPreparaciones = todasLasPreparaciones;
        this.preparacionesVendibles = preparacionesVendibles;
        this.historialVentas = historialVentas;
    }

    private void registrarVenta(Vendible p, int cant) throws PreparacionNoExistenteException{
        if (todasLasPreparaciones.contains(p)){
            p.vender(cant);
            System.out.println("Venta cargada con éxito");
            historialVentas.put((Preparacion) p, cant);
        }
        else{
            throw new PreparacionNoExistenteException("La preparacion mencionada no existe");
        }
    }

    private void nuevaPreparacion(Preparacion p) throws DatosNegativosException{
        if (p.getAzucar() > 0 || p.getHarina() > 0 || p.getHuevos() > 0 || p.getManteca() > 0){
            todasLasPreparaciones.add(p);
            System.out.println("Se ha agregado correctamente la preparación");
        }else{
            throw new DatosNegativosException("Ingrediente con cantidades inválidas");
        }
    }

    private void reponerPreparacion(Preparacion p, int cant) throws DatosNegativosException{
        if (cant > 0){
            p.sumarStock(cant);
            System.out.println("El stock nuevo es de: " + p.getStock());
        }else{
            throw new DatosNegativosException("El stock a agregar tiene que ser mayor a 0");
        }
    }

    private void cantProductosVendibles(){
        System.out.println("La cantidad de productos que estan a la venta son: " + preparacionesVendibles.size());
    }


    public static void main(String[] args) {
        Cookies cookiesRochas = new Cookies(21, 2, 5, 6, 7, 200, 12, Topping.NUTELLA);
        Brownies brownieBlancos = new Brownies(1, 2, 123, 5, 12, 10000, 20);
        Bizcochuelo bizcochueloMantecoso = new Bizcochuelo(5, 10, 400, 2, 2, 12000, 100, 1);

        HashSet<Preparacion> todasLasPreparaciones = new HashSet<>();
        HashSet<Vendible> preparacionesVendibles = new HashSet<>();
        HashMap<Preparacion, Integer> historialVentas = new HashMap<>();

        todasLasPreparaciones.add(cookiesRochas);
        todasLasPreparaciones.add(brownieBlancos);
        todasLasPreparaciones.add(bizcochueloMantecoso);

        preparacionesVendibles.add(brownieBlancos);
        preparacionesVendibles.add(cookiesRochas);

        DesayunoApp sistema = new DesayunoApp(todasLasPreparaciones, preparacionesVendibles, historialVentas);

        bizcochueloMantecoso.conocerReceta();
        cookiesRochas.conocerReceta();
        brownieBlancos.conocerReceta();

        try {
            cookiesRochas.actualizarStock(1);
        } catch (StockInsuficienteException e) {
            throw new RuntimeException(e);
        }
        cookiesRochas.descripcion();
        cookiesRochas.calcularPrecio(20);
        cookiesRochas.vender(2);

        sistema.cantProductosVendibles();
        try {
            sistema.registrarVenta(brownieBlancos, 2);
        } catch (PreparacionNoExistenteException e) {
            throw new RuntimeException(e);
        }
        Cookies cookieOrt = new Cookies(2, 12, 10, 10, 4, 1000.10, 2, Topping.CONFITES);
        try {
            sistema.nuevaPreparacion(cookieOrt);
        } catch (DatosNegativosException e) {
            throw new RuntimeException(e);
        }
        try {
            sistema.reponerPreparacion(brownieBlancos, 1);
        } catch (DatosNegativosException e) {
            throw new RuntimeException(e);
        }
        sistema.cantProductosVendibles();

    }
}


