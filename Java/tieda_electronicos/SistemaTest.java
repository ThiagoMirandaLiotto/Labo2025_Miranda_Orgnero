package tieda_electronicos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaTest {
    private Sistema sistema;
    private Sonido sonido;
    private Televisor televisor;
    private CargadorPortatil cargador;

    @BeforeEach
    public void setUp() {
        sistema = new Sistema(new ArrayList<>());

        sonido = new Sonido("auriculares", 200, 5, true);
        televisor = new Televisor("tele", 300, 2, Tecnologia.CUATROK, 1920);
        cargador = new CargadorPortatil("cargador", 600, 10, 4);

        sistema.agregarProducto(sonido);
        sistema.agregarProducto(televisor);
        sistema.agregarProducto(cargador);
    }

    @Test
    public void testAgregarProducto() {
        int cantidadAntes = sistema.getProductos().size();
        Producto nuevo = new Sonido("auriculares 2", 8, 3, false);
        sistema.agregarProducto(nuevo);
        assertEquals(cantidadAntes + 1, sistema.getProductos().size());
        assertTrue(sistema.getProductos().contains(nuevo));
    }

    @Test
    public void testEliminarProducto() {
        sistema.eliminarProducto(sonido);
        assertFalse(sistema.getProductos().contains(sonido));
    }

    @Test
    public void testModificarProducto() {
        Sonido nuevoSonido = new Sonido("auriculares 3", 10, 6, false);
        sistema.modificarProducto(sonido, nuevoSonido);
        assertFalse(sistema.getProductos().contains(sonido));
        assertTrue(sistema.getProductos().contains(nuevoSonido));
    }

    @Test
    public void testMayorStock() {
        Producto mayor = sistema.mayorStock();
        assertEquals("cargador", mayor.getNombre());
        assertEquals(10, mayor.getStock());
    }

    @Test
    public void testMenorStock() {
        Producto menor = sistema.menorStock();
        assertEquals("tele", menor.getNombre());
        assertEquals(2, menor.getStock());
    }
}
