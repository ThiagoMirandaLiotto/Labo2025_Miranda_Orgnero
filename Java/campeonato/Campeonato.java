package curso;

import fechas.Partido;
import campeonato.Equipo;

import java.util.ArrayList;

public class campeonato {
    private ArrayList<Equipo> equipos = new ArrayList<>();
    private ArrayList<Partido> partidos = new ArrayList<>();

    public void registrarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void dividirEquipos(){
        campeonato Cmaniana = new campeonato();
        campeonato Ctarde = new campeonato();
        campeonato Cnoche = new campeonato();

        for (int i = 0; i < equipos.size(); i++) {
            Cmaniana.registrarEquipo();
            Ctarde.registrarEquipo();
            Cnoche.registrarEquipo();
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

public void mostrarFixture() {
}
