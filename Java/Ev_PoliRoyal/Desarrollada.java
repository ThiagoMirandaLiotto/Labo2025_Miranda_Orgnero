package EvaluacionesInterface.Ev_PoliRoyal;

public interface Desarrollada {
    void invocarCarta(int elixirJugador) throws ElixirInsuficienteException;
    String descripciónCarta();
    void recibirDanio(int danio);
    void evolucionarCarta(int vidaExtra);
}
