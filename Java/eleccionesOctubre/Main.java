package eleccionesOctubre;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Partido partido = new Partido("Unidad Nacional", "Av. Siempre Viva 123", 5000);

        PalomaMensajera p1 = new PalomaMensajera("Paco", "Blanca", "Paloma", true);
        TelefonoMovil t1 = new TelefonoMovil("123", "Samsung", "S21", "Claro", "1122334455", true, 5);
        Trabajador w1 = new Trabajador("Juan", "Perez", "12345678", "01/01/1980",
                "20-12345678-9", 50000, "Calle Falsa 123",
                LocalTime.of(8, 0), LocalTime.of(18, 0));

        partido.agregarMensajero(p1);
        partido.agregarMensajero(t1);
        partido.agregarMensajero(w1);

        partido.hacerCampania();
    }
}
