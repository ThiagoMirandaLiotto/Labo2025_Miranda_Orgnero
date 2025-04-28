package curso;

import personas.Jugador;

import java.util.ArrayList;
import java.util.Date;

public class Equipo {
    private String nombre;
    private String barrio;
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Jugador capitan;
    private String disponibilidadHoraria; // "mañana", "tarde" o "noche"


    public Equipo(String nombre, String barrio, String disponibilidadHoraria){
        this.nombre = nombre;
        this.barrio = barrio;
        this.disponibilidadHoraria = disponibilidadHoraria;
    }

    public void agregarJugador(Jugador jugador, boolean esCapitan) {
        // Verificar que no se repita número de camiseta
        for (Jugador j : jugadores) {
            if (j.getNumero() == jugador.getNumero()) {
                System.out.println("Número de camiseta repetido: " + jugador.getNumero());
                return;
            }
        }

        if (jugadores.size() >= 11) {
            System.out.println("El equipo ya tiene 11 jugadores.");
            return;
        }

        jugadores.add(jugador);

        if (esCapitan) {
            capitan = jugador;
        }
    }






    public String getNombre() {return nombre;}
    public String getBarrio() {return barrio;}
    public ArrayList<Jugador> getJugadores() {return jugadores;}
    public Jugador getCapitan() {return capitan;}
    public String getDisponibilidadHoraria() {return disponibilidadHoraria;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setBarrio(String barrio) {this.barrio = barrio;}
    public void setJugadores(ArrayList<Jugador> jugadores) {this.jugadores = jugadores;}
    public void setCapitan(Jugador capitan) {this.capitan = capitan;}
    public void setDisponibilidadHoraria(String disponibilidadHoraria) {this.disponibilidadHoraria = disponibilidadHoraria;}
}
