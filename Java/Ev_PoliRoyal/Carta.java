package EvaluacionesInterface.Ev_PoliRoyal;

public abstract class Carta {
    private String nombre;
    private int danio;
    private int vida;
    private Arena arena;

    public Carta(String nombre, int danio, int vida, Arena arena) {
        this.nombre = nombre;
        this.danio = danio;
        this.vida = vida;
        this.arena = arena;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDanio() {
        return danio;
    }
    public void setDanio(int danio) {
        this.danio = danio;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public Arena getArena() {
        return arena;
    }
    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public void aumentarVida(int vidaASumar){
        this.vida += vidaASumar;
    }
    public void disminuirVida(int vidaARestar){
        this.vida -= vidaARestar;
    }

    abstract public boolean validarAtributos();

    abstract public void fraseIconica();

}
