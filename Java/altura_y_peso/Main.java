package altura_y_peso;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<LocalDate, Medicion> registros = new HashMap<>();

        registros.put(LocalDate.of(2024, 5, 10), new Medicion(170, 65));
        registros.put(LocalDate.of(2024, 8, 15), new Medicion(172, 68));
        registros.put(LocalDate.of(2025, 2, 20), new Medicion(172, 70));

        Persona persona = new Persona(
                "Juan",
                "Pérez",
                LocalDate.of(2000, 3, 15),
                registros
        );

        LocalDate fechaConsulta = LocalDate.of(2024, 8, 15);

        String resultado = persona.obtenerMedicionEnFecha(fechaConsulta);
        System.out.println(resultado);

        LocalDate fechaSinRegistro = LocalDate.of(2023, 1, 1);
        System.out.println(persona.obtenerMedicionEnFecha(fechaSinRegistro));
    }
}