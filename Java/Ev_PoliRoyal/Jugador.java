package EvaluacionesInterface.Ev_PoliRoyal;

public class Jugador {
    private String nombre;
    private String tag;
    private String clan;
    private Arena arenaActual;
    private int nivelRey;

    public Jugador(String nombre, String tag, String clan, Arena arenaActual, int nivelRey) {
        this.nombre = nombre;
        this.tag = tag;
        this.clan = clan;
        this.arenaActual = arenaActual;
        this.nivelRey = nivelRey;
    }
}
