package EvaluacionesInterface.Ev_PoliRoyal;

import java.util.HashMap;
import java.util.HashSet;

public class PoliRoyaleApp {
    private HashSet<Carta> todasLasCartas;
    private HashSet<Desarrollada> cartasJugables;
    private HashMap<Jugador, Carta> historialConectados;

    public PoliRoyaleApp(HashSet<Carta> todasLasCartas, HashSet<Desarrollada> cartasJugables, HashMap<Jugador, Carta> historialConectados) {
        this.todasLasCartas = todasLasCartas;
        this.cartasJugables = cartasJugables;
        this.historialConectados = historialConectados;
    }

    public String registrarCartaFavorita(Jugador j, Carta nuevaFav) throws jugadorNoEncontradoException, cartaFavoritaRepetidaException {
        if (historialConectados.containsKey(j)){
            if (!historialConectados.get(j).equals(nuevaFav)){
                historialConectados.put(j, nuevaFav);
                return "Carta favorita registrada con éxito";
            }
            else {
                throw new cartaFavoritaRepetidaException("Ya tenía esta carta asignada como favorita");
            }
        }
        else{
            throw new jugadorNoEncontradoException("No tienes registrado ese jugador");
        }
    }

    public void nuevaCarta(Carta c) throws valoresIconrrectosCartaException{
        if (c.validarAtributos()){
            todasLasCartas.add(c);
            try {
                cartasJugables.add((Desarrollada) c);
            } catch (ClassCastException e) {
                System.out.println("no es desarrollada");;
            }
        }
        else {
            throw new valoresIconrrectosCartaException("Carta con valores inválidos");
        }
    }

    public void subirNivel(Desarrollada d, int vidaExtra){
        d.evolucionarCarta(vidaExtra);


            Carta c = (Carta) d;
            System.out.println("La carta ha sido reforzada correctamente, mi nueva vida es: " + c.getVida());

    }

    public void cartaJugables(){
        System.out.println("La cantidad de cartas actualmente jugables son:" +  cartasJugables.size());
    }


    public static void main(String[] args) {
        HashSet<Carta> cartas = new HashSet<>();
        HashSet<Desarrollada> cartasJugables = new HashSet<>();
        HashMap<Jugador, Carta> historialJugadores = new HashMap<>();

        Comun c1 = new Comun("El espíritu de Miguez", 12, 200, Arena.LABO);
        Comun c2 = new Comun("El a", 122, 220, Arena.SUM);

        Especial e1 = new Especial("El mago Pruscino", 1112, 2, Arena.BUFFET, 12, 1, 10);
        Epica ep1 = new Epica("El verdugo Scovenna", 12, 9992, Arena.BUFFET, 10);
        Epica ep2 = new Epica("El príncipe Barbieri", 100, 992, Arena.BUFFET, 2);
        Epica ep3 = new Epica("El cazador Callipo", 1112, 12, Arena.LABO, 120);

        Jugador pj1 = new Jugador("Barbieri", "fasd2", "asiokfn", Arena.BUFFET, 2);
        Jugador pj2 = new Jugador("Miranda", "fasd23", "asiokfn", Arena.BUFFET, 22);
        Jugador pj3 = new Jugador("Gonzad", "fasd24", "asiokfn", Arena.BUFFET, 12);

        cartas.add(c1);
        cartas.add(c2);
        cartas.add(e1);
        cartas.add(ep1);
        cartas.add(ep2);
        cartas.add(ep3);

        cartasJugables.add(c1);
        cartasJugables.add(c2);
        cartasJugables.add(e1);

        historialJugadores.put(pj1, ep2);
        historialJugadores.put(pj2, e1);
        historialJugadores.put(pj3, c1);

        PoliRoyaleApp juego = new PoliRoyaleApp(cartas, cartasJugables, historialJugadores);

        c1.fraseIconica();
        try {
            c2.invocarCarta(10);
        } catch (ElixirInsuficienteException e) {
            throw new RuntimeException(e);
        }
        c1.descripciónCarta();
        c2.recibirDanio(1000);
        c1.evolucionarCarta(2000);

        e1.fraseIconica();
        try {
            c2.invocarCarta(3);
        } catch (ElixirInsuficienteException e) {
            throw new RuntimeException(e);
        }
        e1.descripciónCarta();
        e1.recibirDanio(100);
        e1.evolucionarCarta(2000);


        ep1.fraseIconica();

        juego.cartaJugables();
        try {
            juego.registrarCartaFavorita(pj1, c2);
        } catch (jugadorNoEncontradoException e) {
            throw new RuntimeException(e);
        } catch (cartaFavoritaRepetidaException e) {
            throw new RuntimeException(e);
        }

        try {
            juego.nuevaCarta(e1);
        } catch (valoresIconrrectosCartaException e) {
            throw new RuntimeException(e);
        }

        juego.subirNivel(c2, 290);
    }
}
