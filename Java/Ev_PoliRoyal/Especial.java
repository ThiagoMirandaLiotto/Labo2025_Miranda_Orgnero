package EvaluacionesInterface.Ev_PoliRoyal;

public class Especial extends Carta implements Desarrollada{
    private int nivelDesbloqueo;
    private int costoElixir;
    private int bonus;

    public Especial(String nombre, int danio, int vida, Arena arena, int nivelDesbloqueo, int costoElixir, int bonus) {
        super(nombre, danio, vida, arena);
        this.nivelDesbloqueo = nivelDesbloqueo;
        this.costoElixir = costoElixir;
        this.bonus = bonus;
    }

    public int getNivelDesbloqueo() {
        return nivelDesbloqueo;
    }

    public void setNivelDesbloqueo(int nivelDesbloqueo) {
        this.nivelDesbloqueo = nivelDesbloqueo;
    }

    public int getCostoElixir() {
        return costoElixir;
    }

    public void setCostoElixir(int costoElixir) {
        this.costoElixir = costoElixir;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


    @Override
    public boolean validarAtributos() throws valoresIconrrectosCartaException{
        if (getDanio() > 0 && getVida() > 0 && nivelDesbloqueo > 0 && bonus > 0 && costoElixir > 0){
            return true;
        }else {
            throw new valoresIconrrectosCartaException("Carta con valores inválidos");
        }
    }

    @Override
    public void fraseIconica(){
        System.out.println("Soy una carta especial de nivel " + nivelDesbloqueo + "y mi costo de elixir actual es: " + costoElixir);
    }

    @Override
    public void invocarCarta(int elixirJugador) throws ElixirInsuficienteException{
        if (elixirJugador > costoElixir){
            System.out.println("Elixir suficiente para que esta carta sea usada");
        }
        else{
            System.out.println("No hay elixir suficiente");
        }
    }

    @Override
    public String descripciónCarta(){
        return "“Soy una carta especial y puedo contra todo!";
    }

    @Override
    public void recibirDanio(int danio){
        if (super.getVida() > danio){
            disminuirVida(danio);
            System.out.println("Sigo en combate hasta el final!");
        }
        else{
            super.setVida(0);
            System.out.println("Mori en batalla protegiendo a mi rey!");
        }
    }

    @Override
    public void evolucionarCarta(int vidaExtra){
        aumentarVida(vidaExtra);
        setBonus(getBonus() + 2);
    }
}
