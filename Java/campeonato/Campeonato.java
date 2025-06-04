package campeonato;

import fechas.Fecha;
import fechas.Partido;
import campeonato.Equipo;

import java.util.ArrayList;

public class Campeonato {
    private ArrayList<Equipo> equipos = new ArrayList<>();
    private ArrayList<Partido> partidos = new ArrayList<>();

    public void registrarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void dividirEquipos(){
        Campeonato Cmaniana = new Campeonato();
        Campeonato Ctarde = new Campeonato();
        Campeonato Cnoche = new Campeonato();

        for (int i = 0; i < equipos.size(); i++) {
            Cmaniana.registrarEquipo(new Equipo("Equipo", "Barrio", Turno.MANIANA));
            Ctarde.registrarEquipo(new Equipo("Equipo", "Barrio", Turno.TARDE));
            Cnoche.registrarEquipo(new Equipo("Equipo", "Barrio", Turno.NOCHE));
        }
        }
    public void generarFixture() {
        int diaIndex = 0;

        // Modalidad todos contra todos
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                Equipo equipo1 = equipos.get(i);
                Equipo equipo2 = equipos.get(j);


            }
        }
    }
}
