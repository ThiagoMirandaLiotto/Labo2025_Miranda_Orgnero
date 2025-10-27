package EvaluacionesInterface.Ev_PoliRoyal;

public class Comun extends Carta implements Desarrollada{
    private static int costoElixir = 3;

    public Comun(String nombre, int danio, int vida, Arena arena) {
        super(nombre, danio, vida, arena);
    }


    @Override
    public boolean validarAtributos() throws valoresIconrrectosCartaException{
        if (getDanio() > 0 && getVida() > 0){
            return true;
        }else {
            throw new valoresIconrrectosCartaException("Carta con valores inválidos");
        }
    }

    @Override
    public void fraseIconica(){
        System.out.println("Soy una carta común y mi costo de elixir es: " + costoElixir);
    }

    @Override
    public void invocarCarta(int elixirJugador) throws ElixirInsuficienteException{
        if (elixirJugador > costoElixir){
            System.out.println("Elixir suficiente para que esta carta sea usada");
        }
        else{
            throw new ElixirInsuficienteException("No hay elixir suficiente");
        }
    }

    @Override
    public String descripciónCarta(){
        return "Soy una carta común pero no por eso soy débil!";
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
    }
}
