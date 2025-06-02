package sistema_llamadas;

import fechas.Fecha;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static junit.framework.Assert.*;


public class SistemaTest {

    private Sistema sistema;
    private Empleado ana, luis, maria;
    private Fecha f1, f2, fLlamada1, fLlamada2;

    @BeforeEach
    public void setUp() {
        sistema = new Sistema();

        fLlamada1 = new Fecha(20, 3, 2025);
        fLlamada2 = new Fecha(21, 3, 2025);

        ana = new Empleado("e1", "3", 1, new Fecha(10, 5, 1990), "d1", "Argentina", 1111);
        luis = new Empleado("e2", "3", 2, new Fecha(15, 8, 1992), "d2", "Chile", 2222);
        maria = new Empleado("e3", "3", 3, new Fecha(10, 5, 1990), "d3", "Argentina", 3333);

        sistema.registrarEmpleado(ana);
        sistema.registrarEmpleado(luis);
        sistema.registrarEmpleado(maria);
    }

    @Test

    public void testBuscarPorTelefonoExistente() {
        setUp();
        Empleado encontrado = sistema.buscarPorTelefono(1111);
        assertNotNull(encontrado);
        assertEquals("e1", encontrado.getNombre());
    }


    @Test
    public void testBuscarPorTelefonoInexistente() {
        setUp();
        Empleado encontrado = sistema.buscarPorTelefono(9999);
        assertNull(encontrado);
    }

    @Test
    public void testRegistrarLlamadaYObtenerDuracion() {
        setUp();
        sistema.registrarLlamada(1111, 2222, fLlamada1, 15);

        Llamada llamada = sistema.getLlamadas().get(0);
        assertEquals(15, llamada.getDuracion());
        assertEquals("e1", llamada.getOrigen().getNombre());
        assertEquals("e2", llamada.getDestino().getNombre());
    }

    @Test
    public void testRankingLlamadasExteriorDuracion() {
        setUp();
        sistema.registrarLlamada(1111, 2222, fLlamada1, 10);
        sistema.registrarLlamada(1111, 3333, fLlamada1, 5);
        sistema.registrarLlamada(3333, 2222, fLlamada2, 8);

        int duracionAnaExterior = 0;
        int duracionMariaExterior = 0;

        for (Llamada l : sistema.getLlamadas()) {
            if (!l.getOrigen().getPais().equals(l.getDestino().getPais())) {
                if (l.getOrigen().equals(ana)) {
                    duracionAnaExterior += l.getDuracion();
                } else if (l.getOrigen().equals(maria)) {
                    duracionMariaExterior += l.getDuracion();
                }
            }
        }

        assertEquals(10, duracionAnaExterior);
        assertEquals(8, duracionMariaExterior);
    }
}

